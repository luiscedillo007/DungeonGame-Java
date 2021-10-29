import java.util.Random;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {


    
    sprites ss = new sprites();
    ss.printMenu();
    String dificulty = checkInput("M", "N", "I");
    if (dificulty.equals("M")) {
      int roomsn = 5;
      int keysn = 3;
      Room[] TempGameRooms = createSimpleGame(roomsn, keysn);
      User gamer = new User();
      gamer.setAvalableKeys(keysn);
      RunGame(TempGameRooms, gamer, ss);
    }else if(dificulty.equals("N")){
      int roomsn = 15;
      int keysn = 6;
      Room[] TempGameRooms = createSimpleGame(roomsn, keysn);
      User gamer = new User();
      gamer.setAvalableKeys(keysn);
      RunGame(TempGameRooms, gamer, ss);
    }else if(dificulty.equals("I")){
      System.out.println("");
      System.out.println("\t\t[Message]: Note that Keys must be greater than 2 and Rooms must be an odd number.");
      int roomsn = checkMIntInput();
      int keysn = checkNIntInput();
      Room[] TempGameRooms = createSimpleGame(roomsn, keysn);
      User gamer = new User();
      gamer.setAvalableKeys(keysn);
      RunGame(TempGameRooms, gamer, ss);
      
    }
    
    

    /*
    int roomsn = 15;
    int keysn = 3;
    Room[] GameRooms = createSimpleGame(roomsn, keysn);

    User gamer = new User();
    gamer.setAvalableKeys(keysn);
    sprites ss = new sprites();
    RunGame(GameRooms, gamer, ss);
    */

    //sprites ss = new sprites();
    //ss.printWon();
    





  }

  public static void FinalBoos(sprites ss){
    ss.printDragon();
    String ans = checkInput("Q", "E", "R");
    if(ans.equals("Q")){
      ss.printDeath();
    }else if(ans.equals("E")){
      ss.printDeath2();
    }else {
      ss.printDragonTamer();
      ans = checkInput("P");
      ss.printWon();
    }
  }

  public static void RunGame(Room[] GameRooms, User gamer, sprites ss) {
    int counter = 0;

    ss.Hallway(GameRooms[counter].getNextRoom(), gamer);
    Steps cc = new Steps(false, false);
    Steps c = new Steps(false, false);
    while (counter != -1) {
            String answer;

            answer = checkInput("A", "B", "C");
            if (answer.equals("B") && counter == GameRooms.length - 3) {
                  counter = -1;
                  FinalBoos(ss);
            }else if (answer.equals("B") && !GameRooms[counter].getNextRoom()[0].getRoomName().equals("null")) {
                  if (GameRooms[counter].getNextRoom()[0].getLockedStatus() == false || GameRooms[counter].getNextRoom()[0].getKeyforRoom().getKeyId() == gamer.getKeyFromInventory(GameRooms[counter].getNextRoom()[0].getKeyforRoom()).getKeyId()) {
                        ss.printRoom(GameRooms[counter].getNextRoom()[0]);

                        for (int j = 0; j < GameRooms[counter].getNextRoom()[0].getKeysInside().length; j++) {
                              gamer.setUserKey(GameRooms[counter].getNextRoom()[0].getKeysInside()[j]);
                        }

                        counter++;
                        //a = true;
                        //b = false;
                        c = new Steps(true, false);
                        c.setPrevStep(cc);
                        cc = c;
                        answer = checkInput("P");
                        ss.Hallway(GameRooms[counter].getNextRoom(), gamer);
                  }else {
                        System.out.println("");
                        System.out.println("\t\t[Message]: This room is locked and you dont have the key.");
                  }
            }else if (answer.equals("B") && GameRooms[counter].getNextRoom()[0].getRoomName().equals("null")) {
                  System.out.println("");
                  System.out.println("\t\t[Message] You can't enter a wall.");
            } else if (answer.equals("C") && !GameRooms[counter].getNextRoom()[0].getRoomName().equals("null")) {
                  if (GameRooms[counter].getNextRoom()[1].getLockedStatus() == false || GameRooms[counter].getNextRoom()[1].getKeyforRoom().getKeyId() == gamer.getKeyFromInventory(GameRooms[counter].getNextRoom()[1].getKeyforRoom()).getKeyId()) {
                        ss.printRoom(GameRooms[counter].getNextRoom()[1]);
                        for (int j = 0; j < GameRooms[counter].getNextRoom()[1].getKeysInside().length; j++) {
                              gamer.setUserKey(GameRooms[counter].getNextRoom()[1].getKeysInside()[j]);
                        }
                        counter += 2;
                        //b = true;
                        //a = false;
                        c = new Steps(false, true);
                        c.setPrevStep(cc);
                        cc = c;
                        answer = checkInput("P");
                        ss.Hallway(GameRooms[counter].getNextRoom(), gamer);
                  }else {
                        System.out.println("");
                        System.out.println("\t\t[Message]: This room is locked and you dont have the key.");
                  }
            }else if (answer.equals("A")) {
                  /*
                  if (counter != 0 && a && !b) {
                        counter--;
                        a = false;
                  }else if (counter != 0 && b && !a) {
                        counter -= 2;
                        b = false;
                  }else if (counter != 0 && !a && !b) counter-=2;
                  else if (counter != 0 && a && b) counter --;
                  */
                  //if(counter != 0) counter--;
                  if(counter!= 0 && cc.getA() && cc.getB() == false){
                    counter--;
                    cc = cc.getPrevStep();
                  }else if(counter!= 0 && cc.getA() == false && cc.getB()){
                    counter-=2;
                    cc = cc.getPrevStep();
                  }
                  ss.Hallway(GameRooms[counter].getNextRoom(), gamer);
            }

            //System.out.println(counter);
            //System.out.println("A " + c.);
            //System.out.println("B " + b);
      }
  }

  public static int checkNIntInput(){
    Scanner sc = new Scanner(System.in);
    int n = 0;
    boolean pr = false;
    while(n < 3){
      System.out.println("");
        System.out.print("\t\t[*] Please enter number of Keys: ");
      try{ 
        String line = sc.nextLine();
        n = Integer.parseInt(line);
      } catch(NumberFormatException e){
        System.out.println("");
        System.out.println("\t\t[Error] Incorrect input, please input a number.");
        pr = true;
      }
      if(n < 3 && !pr){
      System.out.println("");
      System.out.println("\t\t[Message] Number of Keys must be greater than 2.");
      }
      pr = false;
    }
    return n;
  }

  public static int checkMIntInput(){
    Scanner sc = new Scanner(System.in);
    int m = 0;
    boolean pr = false;
    while(m % 2 == 0 || m < 3){
      System.out.println("");
        System.out.print("\t\t[*] Please enter number of Rooms: ");
      try{ 
        String line = sc.nextLine();
        m = Integer.parseInt(line);
      } catch(NumberFormatException e){
        System.out.println("");
        System.out.println("\t\t[Error] Incorrect input, please input a number.");
        pr = true;
      }
      if((m < 3 || m % 2 == 0) && !pr){
      System.out.println("");
      System.out.println("\t\t[Message] Number of Rooms must be an odd number greater than 2.");
      }
      pr = false;
    }
    return m;
  }

  public static String checkInput(String a, String b, String c) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.print("\t\t[*] Please enter input for action: ");
    String Input = sc.nextLine();
    Input = Input.toUpperCase();
    while (!Input.equals(a) && !Input.equals(b) && !Input.equals(c)) {
      System.out.println("");
      System.out.println("\t\t[Error] Wrong input, please select an available action.");
      System.out.println("");
      System.out.print("\t\t[*] Please enter input for action: ");
      Input = sc.nextLine();
      Input = Input.toUpperCase();
    }
    return Input;
  }

  public static String checkInput(String a) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.print("\t\t[*] Please enter input for action: ");
    String Input = sc.nextLine();
    Input = Input.toUpperCase();
    while (!Input.equals(a)) {
      System.out.println("");
      System.out.println("\t\t[Error] Wrong input, please select an available action.");
      System.out.println("");
      System.out.print("\t\t[*] Please enter input for action: ");
      Input = sc.nextLine();
      Input = Input.toUpperCase();
    }
    return Input;
  }

  public static String checkInput(String a, String b) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.print("\t\t[*] Please enter input for action: ");
    String Input = sc.nextLine();
    Input = Input.toUpperCase();
    while (!Input.equals(a) && !Input.equals(b)) {
      System.out.println("");
      System.out.println("\t\t[Error] Wrong input, please select an available action.");
      System.out.println("");
      System.out.print("\t\t[*] Please enter input for action: ");
      Input = sc.nextLine();
      Input = Input.toUpperCase();
    }
    return Input;
  }

  public static String checkInputNullDoor(String a, String b) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.print("\t\t[*] Please enter input for action: ");
    String Input = sc.nextLine();
    Input = Input.toUpperCase();
    while (!Input.equals(a)) {
      if (Input.equals(b)) {
        System.out.println("");
        System.out.println("\t\t[Message] You can't enter a wall.");
        System.out.println("");
        System.out.print("\t\t[*] Please enter input for action: ");
        Input = sc.nextLine();
        Input = Input.toUpperCase();
      } else {
        System.out.println("");
        System.out.println("\t\t[Error] Wrong input, please select an available action.");
        System.out.println("");
        System.out.print("\t\t[*] Please enter input for action: ");
        Input = sc.nextLine();
        Input = Input.toUpperCase();
      }
    }
    return Input;
  }

  public static Room[] insert(Room[] a, Room key, int index) {
    Room[] result = new Room[a.length + 1];

    for (int i = 0, j = 0; i < a.length; i++, j++) {
      if (i == index) {
        result[j] = key;
        j++;
      }
      result[j] = a[i];
    }

    return result;
  }


  public static Key[][] GetRoomKeys(int numKeys) {
    Key[] Keys = new Key[numKeys];

    for (int i = 0; i < numKeys; i++) {
      Keys[i] = new Key(1111 + i);
    }


    Key[][] newKeys = new Key[Keys.length][];

    for (int i = 0; i < Keys.length; i++) {
      if (i == 0) {
        Key[] arr = {
          Keys[i],
          Keys[i + 1]
        };
        newKeys[i] = arr;
      } else if (i < Keys.length - 1) {
        Key[] arr = {
          Keys[i + 1]
        };
        newKeys[i] = arr;
      } else {
        Key na = new Key(0);
        Key[] arr = {
          na
        };
        newKeys[i] = arr;
      }
    }

    /*
    0) 1111, 1112
    1) 1113
    2) 1114
    3) 1115
    Last index) 0
    */

    return newKeys;
  }

  public static Room[] getRooms(int numRooms) {
    Room[] rooms = new Room[numRooms];

    for (int i = 0; i < numRooms; i++) {
      String roomname = createRoomName();
      String Message = "Welcome to " + roomname;

      rooms[i] = new Room(roomname, Message);
      //Room[i] = new Room()
    }

    return rooms;
  }

  public static void setKeysToRooms(Room[] newRooms, Key[][] keys) {

    int c = 0;
    int k = 0;
    int s = 0;
    boolean hasNext = false;

    for (int i = 0; i < newRooms.length; i++) {

      if (i == 0) {
        newRooms[i].setKeytoPass(keys[keys.length - 1][0]);
        newRooms[i].setKeysInside(keys[0]);
        newRooms[i].setLockedState(false);
      } else if (c == -2) {
        newRooms[i].setKeytoPass(keys[keys.length - 1][0]);
        newRooms[i].setKeysInside(keys[keys.length - 1]);
        newRooms[i].setLockedState(false);
      } else if (s == -2) {
        newRooms[i].setKeytoPass(keys[keys.length - 1][0]);
        newRooms[i].setKeysInside(keys[keys.length - 1]);
        newRooms[i].setLockedState(false);
      } else {
        newRooms[i].setKeytoPass(keys[c][k]);
        newRooms[i].setKeysInside(keys[s]);
        newRooms[i].setLockedState(true);
      }

      if (hasNext) {
        k--;
        hasNext = false;
      }


      if (i == 1) {
        // newRooms[i].setKeysInside(keys[c]);
        k++;
        hasNext = true;
        c--;
      }
      if (i == 0) c--;

      if (c != -2) c++;
      if (s != -2) s++;
      if (c > keys.length - 1) c = -2;
      if (s > keys.length - 1) s = -2;

    }
  }

  public static void setNextRooms(Room[] newRooms) {

    Room[][] nextRooms = new Room[newRooms.length][];

    for (int i = 0; i < newRooms.length; i++) {

      if (i % 2 == 0 && i + 3 < newRooms.length) {
        Room[] next2Rooms = {
          newRooms[i + 2],
          newRooms[i + 3]
        };
        nextRooms[i] = next2Rooms;
      } else if (i % 2 == 0 && i + 2 < newRooms.length) {
        Room[] next2Rooms = {
          newRooms[i + 2]
        };
        nextRooms[i] = next2Rooms;
      } else {
        Room nullRoom = new Room("null", "Welcome null");
        Key nullKey = new Key(0);
        Key[] nullKeys = {nullKey};
        nullRoom.setKeytoPass(nullKey);
        nullRoom.setKeysInside(nullKeys);
        nullRoom.setLockedState(false);
        nullRoom.setTreasure(-1);
        Room[] nextNullRoom = {
          nullRoom
        };
        nextRooms[i] = nextNullRoom;
      }

      newRooms[i].setNextRoom(nextRooms[i]);
    }


    // 0   23   2      45      4
    // 1        3     
  }

  public static void setTreasure(Room[] newRooms) {
    // 0 no treasure
    // 1 calculator
    // 2 map
    // 3 treasure

    Random rand = new Random();
    int upperbound = newRooms.length - 1;
    int lowerbound = 1;
    int random_index = rand.nextInt(upperbound - lowerbound) + lowerbound;
    int random_treasure = rand.nextInt(20);
    int random_item = rand.nextInt(2 - lowerbound) + lowerbound;

    for (int i = 0; i < newRooms.length; i++) {

      if (random_treasure > 18) {
        if (random_index == i && newRooms[i].getLockedStatus() == false) random_index = rand.nextInt(upperbound - lowerbound) + lowerbound;
        else if (random_index == i && newRooms[i].getLockedStatus() == true) newRooms[i].setTreasure(random_item);
      }

      if (i == newRooms.length - 1) newRooms[i].setTreasure(3);
    }
  }

  public static String createRoomName() {
    Random rand = new Random();
    int lowerbound = 65;
    int upperbound = 90;
    int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;
    int random_integer2 = rand.nextInt(upperbound - lowerbound) + lowerbound;

    char randomChar = (char) random_integer;
    char randomChar2 = (char) random_integer2;
    String name = "Room " + randomChar + randomChar2;
    return name;
  }

  static Room[] createSimpleGame(int numRooms, int numkeys) {

    Key[][] GameKeys = GetRoomKeys(numkeys);

    Room[] GameRoomsOut = getRooms(numRooms);
    setKeysToRooms(GameRoomsOut, GameKeys);
    setNextRooms(GameRoomsOut);
    setTreasure(GameRoomsOut);

    Key a = new Key(0);
    Key[] aa = {a};
    Room init = new Room("init","welcome init", -1, false, a, aa);
    Room[] initNext = {
      GameRoomsOut[0],
      GameRoomsOut[1]
    };
    init.setNextRoom(initNext);
    GameRoomsOut = insert(GameRoomsOut, init, 0);


    return GameRoomsOut;
  }


  static void printHallway(Room[] rooms, boolean[] keysFound) {

    System.out.println("Avalable Rooms: ");
    System.out.println("-------------------");
    for (int i = 0; i < rooms.length; i++) {
      System.out.println(rooms[i].getRoomName() + " | ");
      System.out.println(rooms[i].getWelcomeMessage() + " | ");
      System.out.println("Treasure: " + rooms[i].getTreasureStatus() + " | ");
      System.out.println("Locked: " + rooms[i].getLockedStatus() + " | ");
      System.out.println("Key: " + rooms[i].getKeyforRoom().getKeyId() + " | ");
      Key[] inside = rooms[i].getKeysInside();
      for (int j = 0; j < inside.length; j++) {
        System.out.println("Keys inside: " + rooms[i].getRoomName() + " " + inside[j].getKeyId() + " | ");
      }

      System.out.println("");

    }

  }

  public static void print1dArr(Room[] arr) {
    for (int i = 0; i < arr.length; i++) {

      
      System.out.println(arr[i].getRoomName());
      System.out.println(arr[i].getWelcomeMessage());
      System.out.println("Key for unlock: " + arr[i].getKeyforRoom().getKeyId());
      print1dKeyArr(arr[i].getKeysInside());
      System.out.println("Locked: " + arr[i].getLockedStatus());
      System.out.println("Treasure: " + arr[i].getTreasureStatus());
      //print1dArr2(arr[i].getNextRoom());
      System.out.println("");

      /*
      System.out.println(arr[i].getRoomName());
      printNextRoomsName(arr[i].getNextRoom());
      System.out.println("");
      */
    }
  }

  public static void print1dArr2(Room[] arr) {
    for (int i = 0; i < arr.length; i++) {

      
      System.out.println(arr[i].getRoomName());
      System.out.println(arr[i].getWelcomeMessage());
      System.out.println("Key for unlock: " + arr[i].getKeyforRoom().getKeyId());
      print1dKeyArr(arr[i].getKeysInside());
      System.out.println("Locked: " + arr[i].getLockedStatus());
      System.out.println("Treasure: " + arr[i].getTreasureStatus());

      /*
      System.out.println(arr[i].getRoomName());
      printNextRoomsName(arr[i].getNextRoom());
      System.out.println("");
      */
    }
  }

  public static void printNextRoomsName(Room[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i].getRoomName() + " ");
    }
    System.out.println("");
  }

  public static void print1dKeyArr(Key[] arr) {
    System.out.print("Keys inside room: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i].getKeyId() + " ");
    }
    System.out.println("");
  }

  public static void print2dArr(Key[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j].getKeyId() + " ");
      }
      System.out.println("");
    }
  }


  static void printRoom(Room room, boolean[] keysFound) {

  }
}