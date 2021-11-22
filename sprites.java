public class Sprites {
    
    public Sprites(){

    }

    public void printUserKeys(Key[] arr) {
        System.out.print(" Available Rooms:        +\t\t/o \\_____  | Current Keys: ");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i].keyId + " ");
        }
        System.out.println("");
    }

    public void printUserItems(String[] arr, String s) {
        System.out.print(s+"\t\t|           || | Current Items: ");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

    public void printMenu(){
        
        System.out.println("");
        System.out.println("");

        System.out.print("\t\t\t\t\t  ");
        System.out.println("                                       ____________");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                                  (`-..________....---''  ____..._.-`");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                                   \\`._______.._,.---'''     ,'");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                                   ; )`.      __..-'`-.      /");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                                  / /     _.-' _,.;;._ `-._,'");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                                 / /   ,-' _.-'  //   ``--._``._");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                               ,','_.-' ,-' _.- (( =-    -. `-._`-._____");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                             ,;.''__..-'   _..--.\\.--'````--.._``-.`-._`.");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("              _          |\\,' .-''        ```-'`---'`-...__,._  ``-.`-.`-.`.");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("  _     _.-,'(__)\\__)\\-'' `     ___  .          `     \\      `--._");
        System.out.print("\t\t\t\t\t  ");
        System.out.println(",',)---' /|)          `     `      ``-.   `     /     /     `     `-.");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("\\_____--.  '`  `               __..-.  \\     . (   < _...-----..._   `.");
        System.out.print("\t\t\t\t\t  ");
        System.out.println(" \\_,--..__. \\\\ .-`.\\----'';``,..-.__ \\  \\      ,`_. `.,-'`--'`---''`.  )");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("           `.\\`.\\  `_.-..' ,'   _,-..'  /..,-''(, ,' ; ( _______`___..'__");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                   ((,(,__(    ((,(,__,'  ``'-- `'`.(\\  `.,..______");
        System.out.print("\t\t\t\t\t  ");
        System.out.println("                                                      ``--------..._``--.__");

      
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println("     _                                              _.._");
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println("    | |                                          .' .-'`");
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println("  __| |_   _ _ __   __ _  ___  ___  _ __        /  /");
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println(" / _` | | | | '_ \\ / _` |/ _ \\/ _ \\| '_ \\      |  |");
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println("| (_| | |_| | | | | (_| |  __/ (_) | | | |      \\  '.___.;");
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println(" \\__,_|\\__,_|_| |_|\\__, |\\___|\\___/|_| |_|       '._  _.'");
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println("                    __/ |                           ``");
        System.out.print("\t\t\t\t\t\t    ");
        System.out.println("                   |___/");

        System.out.println("");
        System.out.print("\t\t\t\t\t    ");
        System.out.println(".......................................................................");
        System.out.print("\t\t\t\t\t    ");
        System.out.println(".   o   \\ o /  _ o        __|    \\ /     |__         o _  \\ o /   o   .");
        System.out.print("\t\t\t\t\t    ");
        System.out.println(".  /|\\    |     /\\   __\\o   \\o    |    o/     o/__   /\\     |    /|\\  .");
        System.out.print("\t\t\t\t\t    ");
        System.out.println(".  / \\   / \\   | \\  /) |    ( \\  /o\\  / )    |   (\\  / |   / \\   / \\  .");
        System.out.print("\t\t\t\t\t    ");
        System.out.println(".......................................................................");

        System.out.println("");
        System.out.print("\t");
        System.out.println(". \\ o / ............................ \\ o / .\t. \\ o / .................................. \\ o / .    . \\ o / .............................. \\ o / .");
        System.out.print("\t");
        System.out.println(".   |   .  Easy: Depth 3 & Keys 3  .   |   .\t.   |   .  Adventure: Depth 5 & Keys 8   .   |   .    .   |   .  Custom: Depth n & Keys m  .   |   .");
        System.out.print("\t");
        System.out.println(".   |   .   Max num of Rooms: 15   .   |   .\t.   |   .      Max num of Rooms: 63      .   |   .    .   |   .      Rooms: 2^(n+1) -1  .      |   .");
        System.out.print("\t");
        System.out.println(".  / \\  .        Enter: M          .  / \\  .\t.  / \\  .           Enter: N             .  / \\  .    .  / \\  .         Enter: I           .  / \\  .");

        System.out.println("");
        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tPlease select a difficulty");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void Hallway(Room Root, User gamerIn){

        Room[] rooms = {};

        if(Root != null){
            Room left = Root.left;
            Room right = Root.right;
    
            if(left != null && right != null){
                Room[] temp = {left, right};
                rooms = temp;
            }else if(left != null){
                Room[] temp = {left};
                rooms = temp;
            }else if(right != null){
                Room[] temp = {right};
                rooms = temp;
            }
        }

        int c = rooms.length;
        
        String[] s = new String[rooms.length];
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i] != null && rooms[i].unlock.keyId != 0) s[i] = rooms[i].unlock.keyId + "";
            else s[i] = "    ";
        }
        
        System.out.println("");
        System.out.println("");
        if(c!= 0){
        System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         
         System.out.print("\t");
         System.out.println("-                                           -\t\t __        |");
         System.out.print("\t");
         System.out.print("+        (Depth: " + rooms[0].curDepth + ")");
         this.printUserKeys(gamerIn.getAllUserKeys());
         System.out.print("\t");
         System.out.println("-                                           -\t\t\\__/-='='` |");
         System.out.print("\t");
         
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");       
        }  
         System.out.println("");
         System.out.println("");

        if(c != 0){

        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                       .~'_`~.                       ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                 /(  ,^ .~ ~. ^.  )\\                 ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                 \\ \\/ .^     ^. \\/ /                 ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  Y  /         \\  Y                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  | Y           Y |                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  | |           | |                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  | |  "+rooms[i].name+"  | |                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  | |    "+s[i]+"   | |                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  | |           | |                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  |.|           |.|                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  |:|           |:|                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("                  |:|           |:|                  ");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("__________________|_|           |_|__________________");
        }
        System.out.println("");
        if(c == 2) System.out.print("\t\t\t\t");
        else System.out.print("\t\t\t\t\t\t\t");
        for(int i = 0; i < c;i++){
            System.out.print("__________________]H[           ]H[__________________");
        }
        System.out.println("");

        }else{
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println(".___________________________________________________.");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                        Wall                       |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("|                                                   |");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("_____________________________________________________");
            System.out.print("\t\t\t\t\t\t\t");
            System.out.println("_____________________________________________________");
        }

        System.out.println("");
        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tPlease select a room");
         System.out.println("");

        if(c > 1) System.out.println("\t\tEnter A: Go back\t\tEnter B: "+rooms[0].name+"\t\tEnter C: "+rooms[1].name);
        else if(c != 0) System.out.println("\t\tEnter A: Go back\t\tEnter B: " + rooms[0].name);
        else System.out.println("\t\tEnter A: Go back");
      
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
        
    }

    public void printRoom(Room roomIn){
        String a = roomIn.name;
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 "+a+"                   +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
        
         System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ..___________________________________________.");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ::                                           :");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ||   . - -.                                  | ..");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ||  . .--. .              .....  .....       .'..`.");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || . /    \\ .             |   |  |   |       |: .\\:"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||             |   |  |   |       || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||             |   |  |   |       || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||             '''''  '''''       || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||                                || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  .`-'       '`---------------------------------| |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(" / /                                             \\ \\|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("/ /                                               \\ |"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("/__________________________________________________\\|");
        System.out.println("");

        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tWelcome to: " + a + " young adventurer.");
         System.out.println("");
         
        System.out.print("\t\tYou have found the following keys!: ");
        for(int i = 0; i < roomIn.keysInside.length; i++){
            System.out.print(roomIn.keysInside[i].keyId + " ");
        }
        System.out.println("");

        System.out.println("");
        System.out.print("\t\tYou have found the following Item!: ");
        System.out.print(roomIn.item + " ");
        System.out.println("");

        System.out.println("");
         System.out.println("\t\tEnter P: Continue");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
        
    }

    public void printRandomEvent(Room room, User gamerIn){

        if(room.event == 0){
            System.out.println("");
         System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         
         System.out.print("\t");
         System.out.println("-                                           -\t\t .--[[__]]---. |");

         System.out.print("\t");
         System.out.println("-                                           -\t\t;-----------.| |");

         System.out.print("\t");
         this.printUserItems(gamerIn.userItems, "+      Random Event: Curse Encounter!       +");

         System.out.print("\t");
         System.out.println("-                                           -\t\t|           || |");

         System.out.print("\t");
         System.out.println("-                                           -\t\t|___________|/ |");

         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("Curse: DIE!");
         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("___________");
         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("    /");
         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("   /");

         System.out.print("\t\t\t\t\t\t");
        System.out.println("cgD                            __ _");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("|\\(                          .'  Y '>,");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("\\ \\                        / _   _   \\");
        System.out.print("\t\t\t\t\t\t");
        System.out.println(" \\\\\\                       )(_) (_)(|}");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("  \\\\\\                      {  4A   } /");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("   \\\\\\                      \\uLuJJ/\\l");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("    \\\\\\                     |3    p)/");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("     \\\\\\___ __________      /nnm_n//");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("     c7___-__,__-)\\,__)('.  \\_>-<_/D");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                //V     \\_'-._.__G G_c__.-__<'/ ( \\");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                       <'-._>__-,G_.___)\\   \\7\\");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                      ('-.__.| \\'<.__.-' )   \\ \\");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                      |'-.__'\\  |'-.__.-'.\\   \\ \\");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                      ('-.__''. \\'-.__.-''.|    \\_\\");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                      \\'-.__''|!|'-.__.-'.)     \\ \\");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                       '-.__''\\_|'-.__.-'./      \\ l");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("                        '.__'''>G>-.__.-'>       .--,_"); 
        System.out.println("");

        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tAn evil curse has been cast upon you!");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter A: Run\t\tEnter U: Use Lucky Charm\t\tEnter I: Pray (50/50 chance survival)");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");

        }else if(room.event == 1){
            System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         
         System.out.print("\t");
         System.out.println("-                                           -\t\t .--[[__]]---. |");

         System.out.print("\t");
         System.out.println("-                                           -\t\t;-----------.| |");

         System.out.print("\t");
         this.printUserItems(gamerIn.userItems, "+      Random Event: Kight Encounter!       +");

         System.out.print("\t");
         System.out.println("-                                           -\t\t|           || |");

         System.out.print("\t");
         System.out.println("-                                           -\t\t|___________|/ |");

         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");



         System.out.print("\t\t\t\t\t\t\t\t\t\t  ");
         System.out.println("Kight: You will fail!");
         System.out.print("\t\t\t\t\t\t\t\t\t\t  ");
         System.out.println("_____________________");
         System.out.print("\t\t\t\t\t\t\t\t\t\t  ");
         System.out.println("    /");
         System.out.print("\t\t\t\t\t\t\t\t\t\t  ");
         System.out.println("   /");

         System.out.print("\t\t\t\t\t\t\t\t\t"); 
        System.out.println(",^.");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("|||");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("|||       _T_");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("|||   .-.[:|:].-.");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("===_ /\\|  ''''  |/");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println(" E]_|\\/ \\--|-|''''|");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println(" O  `'  '=[:]| A  |");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("        /====|  P |");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("       /=====`.__.'");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("      []'/===\\'[]");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("      | \\     / |");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("      | |     | |");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("     <\\\\)     (///>");
        System.out.println("");

        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tA knight is blocking your path.");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter A: Run\t\tEnter U: Use sword\t\tEnter I: Block (50/50 chance survival)");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
        
        }else if(room.event == 2){
            System.out.println("");
         System.out.println("");
          System.out.print("\t");
          System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
          
          System.out.print("\t");
          System.out.println("-                                           -\t\t .--[[__]]---. |");
 
          System.out.print("\t");
          System.out.println("-                                           -\t\t;-----------.| |");
 
          System.out.print("\t");
          this.printUserItems(gamerIn.userItems, "+      Random Event: Wizard Encounter!      +");
 
          System.out.print("\t");
          System.out.println("-                                           -\t\t|           || |");
 
          System.out.print("\t");
          System.out.println("-                                           -\t\t|___________|/ |");
 
          System.out.print("\t");
          System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
          System.out.println("");
          System.out.println("");


         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("Wizard: You shall not pass!");
         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("___________________________");
         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("    /");
         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("   /");
        
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println(" _.._");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println(" .||.       /_ _\\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("\\.''./      |'L'| |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("= .. =      | -,| L");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("/ || \\    ,-'\\'/,'`.");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||     ,'   `,,. `.");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ,|____,' , ,;' \\| |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println(" (3|\\    _/|/'   _| |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||/,-''  | >-'' _,\\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||'      ==\\ ,-'  ,'");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |  V \\ ,|");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |    |` |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |    |   \\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |    \\    \\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |     |    \\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |      \\_,-'");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |___,,--')_\\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||         |_|   ccc/");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||        ccc/");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||");
         System.out.println("");

         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tA wizard is blocking your path.");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter A: Run\t\tEnter U: Use book of spells\t\tEnter I: Random Spell (50/50 chance survival)");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
        }


    }

    
    public void printDragon(){
            
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+       Final Boss: Dragon Encounter!       +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

         System.out.print("\t\t\t\t\t\t");
            System.out.println("                                               ___,----'~~~~~~~~~`-----.__");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                                           `//====-              ____,-'~`");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                    -.           \\_|// .   /||\\  `~~~~`---.___./");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("             ______-==.       _-~o  `\\/    |||  \\           _,'`");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("       __,--'   ,=='||\\=_    ;_,_,/ _-'|-   |`\\   \\        ,'");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("    _-'      ,='    | \\`.    '',/~7  /-   /  ||   `\\.     /");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("  .'       ,'       |  \\  \\_  '  /  /-   /   ||      \\   /"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" / _____  /         |     \\.`-_/  /|- _/   ,||       \\ /"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(",-'     `-|--'~~`--_ \\     `==-/  `| \\'--===-'       _/`"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                    `-|      /|    )-'\\~'      _,--''"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                      '-~^\\_/ |    |   `\\_   ,^             /\\"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                           /  \\     \\__   \\/~               `\\"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                       _,-' _/'\\ ,-'~____-'`-/              ``\\"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                      ((->/'    \\|||' `.     `\\.  ,         _||"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" ./                       \\_     `\\      `~---|__i__i__\\--~'_/"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("<_n_                     __-^-_    `)  \\-.______________,-~'"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" `B'\\)                  ///,-'~`__--^-  |-------~~~~^'"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" /^>                           ///,--~`-\\");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("`  `");

         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tA Dragon is blocking your path.");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter Q: Fight\t\tEnter E: Run\t\tEnter R: Make the dragon your homie");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printGameOver(){

        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 Game Over                 +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

    System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tYou are dead");
         System.out.println("");
         System.out.println("\t\tThanks for playing!");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printDeath(){

        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 Game Over                 +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
    
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                   /===-_---~~~~~~~~~------____");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                  |===-~___                _,-'");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                `//~\\\\   ~~~~`---.___.-~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ______-==|                         | |  \\\\           _-~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("       __--~~~  ,-/-==\\\\                        | |   `\\        ,'");
    System.out.print("\t\t\t\t\t");
    System.out.println("    _-~       /'    |  \\\\                      / /      \\      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("  .'        /       |   \\\\                   /' /        \\   /'");
    System.out.print("\t\t\t\t\t");
    System.out.println(" /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'");
    System.out.print("\t\t\t\t\t");
    System.out.println("/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  \\_|      /        _)   ;  ),   __--~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                    '~~--_/      _-~/-  / \\   '-~ \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   {\\__--_/}    / \\\\_>- )<__\\      \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   /'   (_/  _-~  | |__>--<__|      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  |0  0 _/) )-~     | |__>--<__|     |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  / /~ ,_/       / /__>---<__/      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 o o _//        /-~_>---<__-~      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 (^(~          /~_>---<__-      _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                ,/|           /__>--<__/     _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ,//('(          |__>--<__|     /                  .----_");
    System.out.print("\t\t\t\t\t");
    System.out.println("            ( ( '))          |__>--<__|    |                 /' _---_~\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||");
    System.out.print("\t\t\t\t\t");
    System.out.println("      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'");
    System.out.print("\t\t\t\t\t");
    System.out.println("     ~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~");
    System.out.print("\t\t\t\t\t");
    System.out.println("   ;'( ')/ ,)(                              ~~~~~~~~~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ' ') '( (/");

    System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tYou can't kill a dragon without a weapon.");
         System.out.println("");
         System.out.println("\t\tYou are dead");
         System.out.println("");
         System.out.println("\t\tThanks for playing!");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printDeath2(){

        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 Game Over                 +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
    
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                   /===-_---~~~~~~~~~------____");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                  |===-~___                _,-'");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                `//~\\\\   ~~~~`---.___.-~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ______-==|                         | |  \\\\           _-~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("       __--~~~  ,-/-==\\\\                        | |   `\\        ,'");
    System.out.print("\t\t\t\t\t");
    System.out.println("    _-~       /'    |  \\\\                      / /      \\      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("  .'        /       |   \\\\                   /' /        \\   /'");
    System.out.print("\t\t\t\t\t");
    System.out.println(" /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'");
    System.out.print("\t\t\t\t\t");
    System.out.println("/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  \\_|      /        _)   ;  ),   __--~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                    '~~--_/      _-~/-  / \\   '-~ \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   {\\__--_/}    / \\\\_>- )<__\\      \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   /'   (_/  _-~  | |__>--<__|      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  |0  0 _/) )-~     | |__>--<__|     |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  / /~ ,_/       / /__>---<__/      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 o o _//        /-~_>---<__-~      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 (^(~          /~_>---<__-      _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                ,/|           /__>--<__/     _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ,//('(          |__>--<__|     /                  .----_");
    System.out.print("\t\t\t\t\t");
    System.out.println("            ( ( '))          |__>--<__|    |                 /' _---_~\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||");
    System.out.print("\t\t\t\t\t");
    System.out.println("      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'");
    System.out.print("\t\t\t\t\t");
    System.out.println("     ~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~");
    System.out.print("\t\t\t\t\t");
    System.out.println("   ;'( ')/ ,)(                              ~~~~~~~~~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ' ') '( (/");

    System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tYou can't outrun a dragon.");
         System.out.println("");
         System.out.println("\t\tYou are dead");
         System.out.println("");
         System.out.println("\t\tThanks for playing!");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printDragonTamer(){
        
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+          Dragon emblem unlocked!          +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                 ___====-_  _-====___");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("           _--^^^#####//      \\\\#####^^^--_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("        _-^##########// (    ) \\\\##########^-_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("       -############//  |\\^^/|  \\\\############-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("     _/############//   (@::@)   \\\\############\\_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("    /#############((     \\\\//     ))#############\\");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("   -###############\\\\    (oo)    //###############-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  -#################\\\\  / VV \\  //#################-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(" -###################\\\\/      \\//###################-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("_#/|##########/\\######(   /\\   )######/\\##########|\\#_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("   `   `  `      `   / | |  | | \\   '      '  '   '");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                    (  | |  | |  )");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                   __\\ | |  | | /__");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                  (vvv(VVV)(VVV)vvv)");

        System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tCongratulations! You are now a Dragon Tamer!");
         System.out.println("");
         System.out.println("\t\tEnter P: Continue");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printWon(){
        
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 You Won!                  +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

         System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("      (\\/)");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("       \\/");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" (,);");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("((  ^_.  ...");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" ' / /_\\(()))");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("   L( '}{' ())");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("   ) (   )_ (()");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" (_   \\ (   (_)");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" | (__'__\\_) |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  \\___|_(}==/ \\");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  |    |  |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  |_/\\_|  |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("   |  |   |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("    ) )\\  |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  _/| |/  |    \\");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" ( ,\\ |_  '~~~~/7");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  \\_(___)  _/Y");

        System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tCongratulations! You have found the treasure, true love!");
         System.out.println("");
         System.out.println("\t\tThanks for playing!");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

     /*

    public void printWizard(){

         System.out.println("");
         System.out.println("");
          System.out.print("\t");
          System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
          
          System.out.print("\t");
          System.out.println("-                                           -\t\t .--[[__]]---. |");
 
          System.out.print("\t");
          System.out.println("-                                           -\t\t;-----------.| |");
 
          System.out.print("\t");
          this.printUserItems(gamerIn.userItems, "+      Random Event: Wizard Encounter!      +");
 
          System.out.print("\t");
          System.out.println("-                                           -\t\t|           || |");
 
          System.out.print("\t");
          System.out.println("-                                           -\t\t|___________|/ |");
 
          System.out.print("\t");
          System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
          System.out.println("");
          System.out.println("");


         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("Wizard: You shall not pass!");
         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("___________________________");
         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("    /");
         System.out.print("\t\t\t\t\t\t\t\t\t\t");
         System.out.println("   /");
        
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println(" _.._");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println(" .||.       /_ _\\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("\\.''./      |'L'| |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("= .. =      | -,| L");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("/ || \\    ,-'\\'/,'`.");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||     ,'   `,,. `.");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ,|____,' , ,;' \\| |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println(" (3|\\    _/|/'   _| |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||/,-''  | >-'' _,\\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||'      ==\\ ,-'  ,'");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |  V \\ ,|");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |    |` |");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |    |   \\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |    \\    \\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |     |    \\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |      \\_,-'");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||       |___,,--')_\\");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||         |_|   ccc/");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||        ccc/");
         System.out.print("\t\t\t\t\t\t\t\t  ");
         System.out.println("  ||");
         System.out.println("");

         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tA wizard is blocking your path.");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter T: Use book of spells\t\tEnter U: Run\t\tEnter I: Random Spell (50/50 chance survival)");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

   
    public void printUserKeys(Key[] arr) {
        System.out.print("+            Available Rooms:               +\t\t/o \\_____  | Current Keys: ");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i].getKeyId() + " ");
        }
        System.out.println("");
      }


    public void printDragon(){
            
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+       Final Boss: Dragon Encounter!       +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

         System.out.print("\t\t\t\t\t\t");
            System.out.println("                                               ___,----'~~~~~~~~~`-----.__");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                                           `//====-              ____,-'~`");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                    -.           \\_|// .   /||\\  `~~~~`---.___./");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("             ______-==.       _-~o  `\\/    |||  \\           _,'`");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("       __,--'   ,=='||\\=_    ;_,_,/ _-'|-   |`\\   \\        ,'");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("    _-'      ,='    | \\`.    '',/~7  /-   /  ||   `\\.     /");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("  .'       ,'       |  \\  \\_  '  /  /-   /   ||      \\   /"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" / _____  /         |     \\.`-_/  /|- _/   ,||       \\ /"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(",-'     `-|--'~~`--_ \\     `==-/  `| \\'--===-'       _/`"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                    `-|      /|    )-'\\~'      _,--''"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                      '-~^\\_/ |    |   `\\_   ,^             /\\"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                           /  \\     \\__   \\/~               `\\"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                       _,-' _/'\\ ,-'~____-'`-/              ``\\"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("                      ((->/'    \\|||' `.     `\\.  ,         _||"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" ./                       \\_     `\\      `~---|__i__i__\\--~'_/"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println("<_n_                     __-^-_    `)  \\-.______________,-~'"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" `B'\\)                  ///,-'~`__--^-  |-------~~~~^'"); 
            System.out.print("\t\t\t\t\t\t");
            System.out.println(" /^>                           ///,--~`-\\");
            System.out.print("\t\t\t\t\t\t");
            System.out.println("`  `");

         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tA Dragon is blocking your path.");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter Q: Fight\t\tEnter E: Run\t\tEnter R: Make the dragon your homie");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printDeath(){

        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 Game Over                 +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
    
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                   /===-_---~~~~~~~~~------____");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                  |===-~___                _,-'");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                `//~\\\\   ~~~~`---.___.-~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ______-==|                         | |  \\\\           _-~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("       __--~~~  ,-/-==\\\\                        | |   `\\        ,'");
    System.out.print("\t\t\t\t\t");
    System.out.println("    _-~       /'    |  \\\\                      / /      \\      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("  .'        /       |   \\\\                   /' /        \\   /'");
    System.out.print("\t\t\t\t\t");
    System.out.println(" /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'");
    System.out.print("\t\t\t\t\t");
    System.out.println("/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  \\_|      /        _)   ;  ),   __--~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                    '~~--_/      _-~/-  / \\   '-~ \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   {\\__--_/}    / \\\\_>- )<__\\      \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   /'   (_/  _-~  | |__>--<__|      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  |0  0 _/) )-~     | |__>--<__|     |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  / /~ ,_/       / /__>---<__/      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 o o _//        /-~_>---<__-~      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 (^(~          /~_>---<__-      _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                ,/|           /__>--<__/     _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ,//('(          |__>--<__|     /                  .----_");
    System.out.print("\t\t\t\t\t");
    System.out.println("            ( ( '))          |__>--<__|    |                 /' _---_~\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||");
    System.out.print("\t\t\t\t\t");
    System.out.println("      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'");
    System.out.print("\t\t\t\t\t");
    System.out.println("     ~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~");
    System.out.print("\t\t\t\t\t");
    System.out.println("   ;'( ')/ ,)(                              ~~~~~~~~~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ' ') '( (/");

    System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tYou can't kill a dragon without a weapon.");
         System.out.println("");
         System.out.println("\t\tYou are dead");
         System.out.println("");
         System.out.println("\t\tThanks for playing!");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printDeath2(){

        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 Game Over                 +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
    
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                   /===-_---~~~~~~~~~------____");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                  |===-~___                _,-'");
    System.out.print("\t\t\t\t\t");
    System.out.println("                                                `//~\\\\   ~~~~`---.___.-~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ______-==|                         | |  \\\\           _-~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("       __--~~~  ,-/-==\\\\                        | |   `\\        ,'");
    System.out.print("\t\t\t\t\t");
    System.out.println("    _-~       /'    |  \\\\                      / /      \\      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("  .'        /       |   \\\\                   /' /        \\   /'");
    System.out.print("\t\t\t\t\t");
    System.out.println(" /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'");
    System.out.print("\t\t\t\t\t");
    System.out.println("/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  \\_|      /        _)   ;  ),   __--~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                    '~~--_/      _-~/-  / \\   '-~ \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   {\\__--_/}    / \\\\_>- )<__\\      \\");
    System.out.print("\t\t\t\t\t");
    System.out.println("                   /'   (_/  _-~  | |__>--<__|      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  |0  0 _/) )-~     | |__>--<__|     |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                  / /~ ,_/       / /__>---<__/      |");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 o o _//        /-~_>---<__-~      /");
    System.out.print("\t\t\t\t\t");
    System.out.println("                 (^(~          /~_>---<__-      _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("                ,/|           /__>--<__/     _-~");
    System.out.print("\t\t\t\t\t");
    System.out.println("             ,//('(          |__>--<__|     /                  .----_");
    System.out.print("\t\t\t\t\t");
    System.out.println("            ( ( '))          |__>--<__|    |                 /' _---_~\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\");
    System.out.print("\t\t\t\t\t");
    System.out.println("        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||");
    System.out.print("\t\t\t\t\t");
    System.out.println("      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'");
    System.out.print("\t\t\t\t\t");
    System.out.println("     ~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~");
    System.out.print("\t\t\t\t\t");
    System.out.println("   ;'( ')/ ,)(                              ~~~~~~~~~~");
    System.out.print("\t\t\t\t\t");
    System.out.println("  ' ') '( (/");

    System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tYou can't outrun a dragon.");
         System.out.println("");
         System.out.println("\t\tYou are dead");
         System.out.println("");
         System.out.println("\t\tThanks for playing!");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printDragonTamer(){
        
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+          Dragon emblem unlocked!          +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                 ___====-_  _-====___");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("           _--^^^#####//      \\\\#####^^^--_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("        _-^##########// (    ) \\\\##########^-_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("       -############//  |\\^^/|  \\\\############-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("     _/############//   (@::@)   \\\\############\\_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("    /#############((     \\\\//     ))#############\\");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("   -###############\\\\    (oo)    //###############-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  -#################\\\\  / VV \\  //#################-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(" -###################\\\\/      \\//###################-");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("_#/|##########/\\######(   /\\   )######/\\##########|\\#_");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("   `   `  `      `   / | |  | | \\   '      '  '   '");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                    (  | |  | |  )");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                   __\\ | |  | | /__");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("                  (vvv(VVV)(VVV)vvv)");

        System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tCongratulations! You are now a Dragon Tamer!");
         System.out.println("");
         System.out.println("\t\tEnter P: Continue");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printWon(){
        
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 You Won!                  +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

         System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("      (\\/)");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("       \\/");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" (,);");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("((  ^_.  ...");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" ' / /_\\(()))");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("   L( '}{' ())");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("   ) (   )_ (()");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" (_   \\ (   (_)");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" | (__'__\\_) |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  \\___|_(}==/ \\");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  |    |  |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  |_/\\_|  |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("   |  |   |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("    ) )\\  |    |");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  _/| |/  |    \\");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println(" ( ,\\ |_  '~~~~/7");
        System.out.print("\t\t\t\t\t\t\t\t  ");
        System.out.println("  \\_(___)  _/Y");

        System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tCongratulations! You have found the treasure, true love!");
         System.out.println("");
         System.out.println("\t\tThanks for playing!");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printRoom(Room roomIn){
        String a = roomIn.getRoomName();
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+                 "+a+"                   +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
        
         System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ..___________________________________________.");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ::                                           :");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ||   . - -.                                  | ..");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  ||  . .--. .              .....  .....       .'..`.");
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || . /    \\ .             |   |  |   |       |: .\\:"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||             |   |  |   |       || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||             |   |  |   |       || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||             '''''  '''''       || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  || ||      ||                                || |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("  .`-'       '`---------------------------------| |#|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println(" / /                                             \\ \\|"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("/ /                                               \\ |"); 
        System.out.print("\t\t\t\t\t\t\t");
        System.out.println("/__________________________________________________\\|");
        System.out.println("");

        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tWelcome to: " + a + " young adventurer.");
         System.out.println("");
         if(roomIn.getKeysInside().length > 1){
         System.out.println("\t\tYou have found the following keys!: Key: " + roomIn.getKeysInside()[0].getKeyId() + ", Key: " + roomIn.getKeysInside()[1].getKeyId());
         }else System.out.println("\t\tYou have found the following keys!: Key: " + roomIn.getKeysInside()[0].getKeyId());
         System.out.println("");
         System.out.println("\t\tYou have found the following items!:");
         System.out.println("");
         System.out.println("\t\tEnter P: Continue");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
        
    }

    public void printWizard(){

        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+      Random Event: Wizard Encounter!      +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("Wizard: You shall not pass unless you solve this riddle!");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("__________________________________________________________");
         System.out.print("\t\t\t\t\t\t\t\t");
         System.out.println("    /");
         System.out.print("\t\t\t\t\t\t\t\t");
         System.out.println("   /");
        
         System.out.print("\t\t\t\t\t\t");
         System.out.println(" _.._");
         System.out.print("\t\t\t\t\t\t");
         System.out.println(" .||.       /_ _\\");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("\\.''./      |'L'| |");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("= .. =      | -,| L");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("/ || \\    ,-'\\'/,'`.");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||     ,'   `,,. `.");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ,|____,' , ,;' \\| |");
         System.out.print("\t\t\t\t\t\t");
         System.out.println(" (3|\\    _/|/'   _| |");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||/,-''  | >-'' _,\\");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||'      ==\\ ,-'  ,'");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||       |  V \\ ,|");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||       |    |` |");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||       |    |   \\");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||       |    \\    \\");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||       |     |    \\");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||       |      \\_,-'");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||       |___,,--')_\\");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||         |_|   ccc/");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||        ccc/");
         System.out.print("\t\t\t\t\t\t");
         System.out.println("  ||");
         System.out.println("");

         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tRiddle to solve:");
         System.out.println("");
         System.out.println("\t\tYou measure my life in hours and I serve you by expiring.");
         System.out.println("\t\tI am quick when I am thin and slow when I am fat. The wind is my enemy.");
         System.out.println("");
         System.out.println("\t\tEnter W: Echo\t\tEnter Z: Candle\t\tEnter Y: Sand Clock");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    public void printCurse(){
        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+      Random Event: Curse Encounter!       +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");

         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("Curse: DIE!");
         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("___________");
         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("    /");
         System.out.print("\t\t\t\t\t\t\t\t\t");
         System.out.println("   /");

         System.out.print("\t\t\t\t\t");
        System.out.println("cgD                            __ _");
        System.out.print("\t\t\t\t\t");
        System.out.println("|\\(                          .'  Y '>,");
        System.out.print("\t\t\t\t\t");
        System.out.println("\\ \\                        / _   _   \\");
        System.out.print("\t\t\t\t\t");
        System.out.println(" \\\\\\                       )(_) (_)(|}");
        System.out.print("\t\t\t\t\t");
        System.out.println("  \\\\\\                      {  4A   } /");
        System.out.print("\t\t\t\t\t");
        System.out.println("   \\\\\\                      \\uLuJJ/\\l");
        System.out.print("\t\t\t\t\t");
        System.out.println("    \\\\\\                     |3    p)/");
        System.out.print("\t\t\t\t\t");
        System.out.println("     \\\\\\___ __________      /nnm_n//");
        System.out.print("\t\t\t\t\t");
        System.out.println("     c7___-__,__-)\\,__)('.  \\_>-<_/D");
        System.out.print("\t\t\t\t\t");
        System.out.println("                //V     \\_'-._.__G G_c__.-__<'/ ( \\");
        System.out.print("\t\t\t\t\t");
        System.out.println("                       <'-._>__-,G_.___)\\   \\7\\");
        System.out.print("\t\t\t\t\t");
        System.out.println("                      ('-.__.| \\'<.__.-' )   \\ \\");
        System.out.print("\t\t\t\t\t");
        System.out.println("                      |'-.__'\\  |'-.__.-'.\\   \\ \\");
        System.out.print("\t\t\t\t\t");
        System.out.println("                      ('-.__''. \\'-.__.-''.|    \\_\\");
        System.out.print("\t\t\t\t\t");
        System.out.println("                      \\'-.__''|!|'-.__.-'.)     \\ \\");
        System.out.print("\t\t\t\t\t");
        System.out.println("                       '-.__''\\_|'-.__.-'./      \\ l");
        System.out.print("\t\t\t\t\t");
        System.out.println("                        '.__'''>G>-.__.-'>       .--,_"); 
        System.out.println("");

        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tAn evil curse has been cast upon you!");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter T: Use Lucky Charm\t\tEnter U: Run\t\tEnter I: Pray (50/50 chance survival)");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");

        
    }


    public void printKnight(){

        System.out.println("");
        System.out.println("");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+      Random Event: Kight Encounter!       +");
         System.out.print("\t");
         System.out.println("-                                           -");
         System.out.print("\t");
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
         System.out.println("");
         System.out.println("");
         System.out.print("\t\t\t\t\t\t\t\t");
         System.out.println("Kight: You will fail!");
         System.out.print("\t\t\t\t\t\t\t\t");
         System.out.println("_____________________");
         System.out.print("\t\t\t\t\t\t\t\t");
         System.out.println("    /");
         System.out.print("\t\t\t\t\t\t\t\t");
         System.out.println("   /");

         System.out.print("\t\t\t\t\t\t"); 
        System.out.println(",^.");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("|||");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("|||       _T_");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("|||   .-.[:|:].-.");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("===_ /\\|  ''''  |/");
        System.out.print("\t\t\t\t\t\t");
        System.out.println(" E]_|\\/ \\--|-|''''|");
        System.out.print("\t\t\t\t\t\t");
        System.out.println(" O  `'  '=[:]| A  |");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("        /====|  P |");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("       /=====`.__.'");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("      []'/===\\'[]");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("      | \\     / |");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("      | |     | |");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("     <\\\\)     (///>");
        System.out.println("");

        System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
         System.out.println("");
         System.out.println("\t\tA knight is blocking your path.");
         System.out.println("");
         System.out.println("\t\tHow will you respond?");
         System.out.println("");
         System.out.println("\t\tEnter Q: Fight\t\tEnter E: Run\t\tEnter R: Block (50/50 chance survival)");
         System.out.println("");
         System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x");
    }

    */
}                     
       
