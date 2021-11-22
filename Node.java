public class Node {
    public Room data;
    public Node next;
    public Key dataKey;
    public int dataInt = Integer.MIN_VALUE;

    public Node tail;

    public Node(){}

    public Node(Room data){
        this.data = data;
    }
    public Node(Key dataKey){
        this.dataKey = dataKey;
    }

    public void addLockedRoom(Room locked){
        if(this.data == null){
            this.data = locked;
            this.tail = this;
        } 
        else{
            this.tail.next = new Node(locked);
            this.tail = this.tail.next;
        } 
    }
    
    public void removeLockedRoom(){

        if(this.next != null){
            
            this.data = this.next.data;

            if(this.next.next != null){
                this.next = this.next.next;
            }else{
                this.next = null;
            }

        }else{
            this.data = null;
        }
        
       
    }
    

}
 