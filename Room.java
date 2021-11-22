public class Room {

    String name;
    int event;
    String item;
    int curDepth;
    boolean flag;

    Key unlock;
    Key[] keysInside;
    
    boolean dragonLayer;

    boolean playing = true;

    Room parent;
    Room left;
    Room right;

  public Room(String name, Key unlock, Key[] keysInside){
      this.name = name;
      this.unlock = unlock;
      this.keysInside = keysInside;
  }

  public Room(String name, Key unlock, Key[] keysInside, int event, Room parent, int curDepth, String item, boolean dragonLayer, boolean flag){
      this.name = name;
      this.unlock = unlock;
      this.parent = parent;
      this.keysInside = keysInside;
      this.event = event;
      this.curDepth = curDepth;
      this.dragonLayer = dragonLayer;
      this.item = item;
      this.flag = flag;
  }

  public void printTreeInfo(){

      Room cur = this;

      System.out.println("Name: " + cur.name + " Parent: " + cur.parent.name + " Key to unlock: " + cur.unlock.keyId + " event: " + cur.event + 
      " cur depht: " + cur.curDepth + " item inside: " + cur.item + " Dragon: " + cur.dragonLayer + " flag?: " + cur.flag);
      cur.printKeysInside();
      System.out.println("---");
      
      if(cur.left != null){
          cur.left.printTreeInfo();
      }
    
      if(cur.right != null){
          cur.right.printTreeInfo();
      }

  }

  public void printRoomInfo(){

    Room cur = this;

    System.out.println("Name: " + cur.name + " Parent: " + cur.parent.name + " Key to unlock: " + cur.unlock.keyId + " event: " + cur.event + 
    " cur depht: " + cur.curDepth + " item inside: " + cur.item + " Dragon: " + cur.dragonLayer + " flag?: " + cur.flag);
    cur.printKeysInside();
    System.out.println("---");
    
}

  public void printKeysInside(){
      for(int i = 0; i < this.keysInside.length; i++){
          System.out.println(this.keysInside[i].keyId);
      }
  }

    
}



