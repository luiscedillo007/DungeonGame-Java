public class Stack{

    public Node head;
    public int numElements;
    
    public Stack(){}

     public boolean maybePushUnlockedRoom(Room room){

         Node newRoom = new Node(room); 

         if(newRoom.data.unlock.keyId == 0 || newRoom.data.flag){
            newRoom.next = head;
            head = newRoom;
            numElements+=1;
            return true;
         }

         return false;

     }
     
     public Room popUnlockedRoom(){
        if(head == null) return null;
        Node remove = head;
        head = head.next;
        numElements-=1;
        return remove.data;
     }

     public boolean isEmpty(){
        if(head == null) return true;
        return false;
     }

     public Stack clone(){
        Stack aux = new Stack();
        Stack aux2 = new Stack();

        Stack cur = this;

        while(!this.isEmpty()){
           aux.maybePushUnlockedRoom(cur.popUnlockedRoom());
        }

        while(!aux.isEmpty()){
           Room temp = aux.popUnlockedRoom();
           aux2.maybePushUnlockedRoom(temp);
           cur.maybePushUnlockedRoom(temp);
        }

        return aux2;

     }

}

