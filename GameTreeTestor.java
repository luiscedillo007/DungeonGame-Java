public class GameTreeTestor {
    

    public GameTreeTestor(){

    }

    public Room generateWinnableRandomGame(Key gameKeys, int maxDepth, boolean testPassed){

        Stack unLockedRooms = new Stack();
        Node lockedRooms = new Node();
        
        GameTreeGenerator GameRoot = new GameTreeGenerator(gameKeys, maxDepth);

        testPassed = IsGameWinnable(GameRoot.root, unLockedRooms, lockedRooms);

        if(testPassed) return GameRoot.root;
        
        return generateWinnableRandomGame(gameKeys, maxDepth, testPassed);

        
    }

    public boolean IsGameWinnable(Room root, Stack unLockedRooms, Node lockedRooms){

        UnlockRoomsWithKeys(root, unLockedRooms, lockedRooms);

        if(unLockedRooms.numElements > 5 && lockedRooms.data == null) return true;

        return false;

    }

    public void UnlockRoomsWithKeys(Room root, Stack unLockedRooms, Node lockedRooms){

        if(root == null) return;
        
        boolean unlocked = unLockedRooms.maybePushUnlockedRoom(root);

        if(unlocked){
            if(root.left != null) UnlockRoomsWithKeys(root.left, unLockedRooms, lockedRooms);
            if(root.right != null) UnlockRoomsWithKeys(root.right, unLockedRooms, lockedRooms);
        }else{
            lockedRooms.addLockedRoom(root);
            findKeyInPastRooms(unLockedRooms, lockedRooms);
            if(root.flag) UnlockRoomsWithKeys(root, unLockedRooms, lockedRooms);
        }

    }

    public void findKeyInPastRooms(Stack unLockedRooms, Node lockedRooms){

        if(lockedRooms == null) return;
        if(lockedRooms.data == null) return;

        Stack temp = unLockedRooms.clone();

        while(!temp.isEmpty()){
            Room aux = temp.popUnlockedRoom();
                for(int i = 0; i < aux.keysInside.length; i++){
                    if(lockedRooms.data.unlock.keyId == aux.keysInside[i].keyId){
                        lockedRooms.data.flag = true;
                        lockedRooms.removeLockedRoom();
                        findKeyInPastRooms(unLockedRooms, lockedRooms);
                        return;
                    }
                }
        }

        if(lockedRooms != null) findKeyInPastRooms(unLockedRooms, lockedRooms.next);

    }

    public void printingStack(Stack Rooms){

        if(Rooms.isEmpty()) return;

        Rooms.popUnlockedRoom().printRoomInfo();

        printingStack(Rooms);

    }

    public void printLinkedList(Node head){
        
        if(head == null) return;
        
        if(head.data != null) head.data.printRoomInfo();
 
        printLinkedList(head.next);
        
    }


}
