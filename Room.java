public class Room {

  public int key;
  public String name;
  public boolean startingPoint;

  public Room parent;

  public Room left;
  public Room right;

  public Room(){
    
  }

  public Room(boolean isRoot, int key, String name){
    this.key = key;
    this.name = name;
    if(isRoot) startingPoint = true;
  }

  public String getInfo(){
    return "Key: " + key + " Name: " + name;
  }

  public void addRoom(boolean isRoot, int key, String name){
        
    Room child = new Room(isRoot, key, name);

    if(this != null){

        Room tempRoom = this;
        
        while(true){

            parent = tempRoom;

            if(key < tempRoom.key){
              
                tempRoom = tempRoom.left;

                if(tempRoom == null){
                    child.parent = parent;
                    parent.left = child;
                    return;
                }

            }else {

                tempRoom = tempRoom.right;

                if(tempRoom == null){
                    child.parent = parent;
                    parent.right = child;
                    return;
                }

            }
        }
    } 
  }

  public void printTreeOfRooms(){

    System.out.println(this.getInfo());

    if(this.left != null) this.left.printTreeOfRooms();
    
    if(this.right != null) this.right.printTreeOfRooms();
    
  }


}



  /*

  public String roomName;
  public String roomMessage;
  public int Treasure;
  public boolean isLocked;
  public Key KeyForRoom;
  public Key[] KeyInsideRoom; 
  public Room[] next;

  public Room(String roomNameIn, String roomMessageIn, int hasTreasureIn, boolean isLockedIn, Key KeyForRoomIn, Key[] KeyInsideRoomIn) {
    roomName = roomNameIn;
    roomMessage = roomMessageIn;
    Treasure = hasTreasureIn;
    isLocked = isLockedIn;
    KeyForRoom = KeyForRoomIn;
    KeyInsideRoom = KeyInsideRoomIn;
  }

  public Room(String roomNameIn, String roomMessageIn) {
    roomName = roomNameIn;
    roomMessage = roomMessageIn;
  }

  public Room(String roomNameIn) {
    roomName = roomNameIn;
  }

  public void setNextRoom(Room[] nextIn){
      next = nextIn;
  }

  public void setKeytoPass(Key keyIn){
    KeyForRoom = keyIn;
  }

  public void setKeysInside(Key[] keysIn){
    KeyInsideRoom = keysIn;
  }

  public void setLockedState(boolean lockedStateIn){
      isLocked = lockedStateIn;
  }

  public void setTreasure(int treasureIn){
    Treasure = treasureIn;
  }

  public Room[] getNextRoom(){
    return this.next;
  }

  public String getWelcomeMessage(){
    return this.roomMessage;
  }

  public String getRoomName(){
    return this.roomName;
  }

  public int getTreasureStatus(){
    return this.Treasure;
  }

  public boolean getLockedStatus(){
    return this.isLocked;
  }

  public Key getKeyforRoom(){
    return this.KeyForRoom;
  }

  public Key[] getKeysInside(){
    return this.KeyInsideRoom;
  } 



  */


