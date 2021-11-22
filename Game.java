import java.util.Random;

// Notes: Compile javac -d bin Game.java
// Run java -cp bin Game

public class Game {
 
    public static void main(String[] args) {

        Sprites ss = new Sprites();
        Input controller = new Input();

        ss.printMenu();
        String dificulty = controller.checkInput("M", "N", "I");
        if (dificulty.equals("M")) {
            int depth = 3;
            int keysn = 3;
            start(depth, keysn);
        }else if(dificulty.equals("N")){
            int depth = 5;
            int keysn = 8;
            start(depth, keysn);
        }else if(dificulty.equals("I")){
            System.out.println("");
            System.out.println("\t\t[Message]: Note that number of Keys and Rooms must be positive.");
            int depth = controller.checkMIntInput();
            int keysn = controller.checkNIntInput();
            start(depth, keysn);
        }
    

    }

    public static void start(int maxDepth, int numKeys){
        
        Key gameKeys = new Key();
        gameKeys.generateKeys(numKeys);
        
        GameTreeTestor RootTestor = new GameTreeTestor();
        Room WinnableRoot = RootTestor.generateWinnableRandomGame(gameKeys, maxDepth, false);

        User user = new User();
        user.setAvalableKeys(gameKeys, numKeys);
        user.setAvalableItems();
        
        //GameRoot.root.printTreeInfo();
        play(WinnableRoot, user);

    }

    public static void play(Room Root, User user){
        Input controller = new Input();
        Sprites spr = new Sprites();

        Room cur = Root;
        boolean wall = false;
      
        spr.Hallway(cur, user);
        
        while(cur.playing){
            
            String answer;

            if(!wall){
                answer = controller.checkInput("A", "B", "C");
            }else {
                answer = controller.checkInput("A");
            }

            if(answer.equals("A")){
                cur = cur.parent;
                wall = false;
                spr.Hallway(cur, user);
            }else if(answer.equals("B") && !wall){
                
                if(cur.left != null && user.getKeyFromInventory(cur.left.unlock).keyId == cur.left.unlock.keyId){
                    
                    if(!cur.left.dragonLayer){

                        if(cur.left.event != -1) cur = handleEvent(cur, user, true);

                        else{
                            cur = cur.left;
                            spr.printRoom(cur);
                            answer = controller.checkInput("P"); 
                            user.addRoomKeysToUser(cur);
                            user.setUserItem(cur.item);
                            spr.Hallway(cur, user);
                        }

                        
                    }else{
                        cur.playing = false;
                        FinalBoos(spr);
                       
                    }

                }else if(cur.right != null && user.getKeyFromInventory(cur.right.unlock).keyId == cur.right.unlock.keyId && cur.left == null){
                    
                    if(!cur.right.dragonLayer){

                        if(cur.right.event != -1) cur = handleEvent(cur, user, false);
                        else{
                            cur = cur.right;
                            spr.printRoom(cur);
                            answer = controller.checkInput("P"); 
                            user.addRoomKeysToUser(cur);
                            user.setUserItem(cur.item);
                            spr.Hallway(cur, user);
                        }
                
                    }else{
                        cur.playing = false;
                        FinalBoos(spr);
                    }

                }else{
                    System.out.println("");
                    System.out.println("\t\t[Message] You dont have key");
                }
            }else if(answer.equals("C") && !wall){
                
                if(cur.right != null && user.getKeyFromInventory(cur.right.unlock).keyId == cur.right.unlock.keyId){
                    
                    if(!cur.right.dragonLayer){
                    
                        if(cur.right.event != -1) cur = handleEvent(cur, user, false);
                        
                        else{
                            cur = cur.right;
                            spr.printRoom(cur);
                            answer = controller.checkInput("P");
                            user.addRoomKeysToUser(cur);
                            user.setUserItem(cur.item);
                            spr.Hallway(cur, user);
                        }
                    
                        
                    }else{
                        cur.playing = false;
                        FinalBoos(spr);
                    }
                    
                }else if(cur.left != null && user.getKeyFromInventory(cur.left.unlock).keyId == cur.left.unlock.keyId && cur.right == null){
                    
                    if(!cur.left.dragonLayer){

                        if(cur.left.event != -1) cur = handleEvent(cur, user, true);

                        else{
                            cur = cur.left;
                            spr.printRoom(cur);
                            answer = controller.checkInput("P");
                            user.addRoomKeysToUser(cur);
                            user.setUserItem(cur.item);
                            spr.Hallway(cur, user);
                        }

                    }else{
                        cur.playing = false;
                        FinalBoos(spr);
                    }

                }else{
                    System.out.println("");
                    System.out.println("\t\t[Message] You dont have key");
                }
            }
         
            if(cur.left == null && cur.right == null){
                wall = true;
            } 

        }
    }

    
    public static Room handleEvent(Room cur, User user, boolean isLeft){
        Input controller = new Input();
        boolean handle = true;

        Sprites spr = new Sprites();
        Random rand = new Random();
        
        if(isLeft){
            spr.printRandomEvent(cur.left,user);
            
            while(handle){
            
                String answer = controller.checkInput("A", "U", "I");

                if(answer.equals("A")){
                    spr.Hallway(cur, user);
                    handle = false;
                } 

                else if(answer.equals("U") && user.getItemFromInventory(user.availableItems[cur.left.event]).equals(user.availableItems[cur.left.event])){
                    cur = cur.left;
                    cur.event = -1;
                    spr.printRoom(cur);
                    answer = controller.checkInput("P");
                    user.addRoomKeysToUser(cur);
                    user.setUserItem(cur.item);
                    spr.Hallway(cur, user);
                    handle = false;
                }else if(answer.equals("U") && !user.getItemFromInventory(user.availableItems[cur.left.event]).equals(user.availableItems[cur.left.event])){
                    System.out.println("");
                    System.out.println("\t\t[Message] You dont have " + user.availableItems[cur.left.event]);
                }else if(answer.equals("I")){
                    int survive = rand.nextInt(2);
                    if(survive == 0){
                        cur = cur.left;
                        cur.event = -1;
                        spr.printRoom(cur);
                        answer = controller.checkInput("P");
                        user.addRoomKeysToUser(cur);
                        user.setUserItem(cur.item);
                        spr.Hallway(cur, user);
                        handle = false;
                    }else{
                        spr.printGameOver();
                        cur.playing = false;
                        handle = false;
                    }
                }
            }
        }else{
            spr.printRandomEvent(cur.right, user);
            while(handle){
                String answer = controller.checkInput("A", "U", "I");

                if(answer.equals("A")){
                    spr.Hallway(cur, user);
                    handle = false;
                } 

                else if(answer.equals("U") && user.getItemFromInventory(user.availableItems[cur.right.event]).equals(user.availableItems[cur.right.event])){
                    cur = cur.right;
                    cur.event = -1;
                    spr.printRoom(cur);
                    answer = controller.checkInput("P"); 
                    user.addRoomKeysToUser(cur);
                    user.setUserItem(cur.item);
                    spr.Hallway(cur, user);
                    handle = false;
                }else if(answer.equals("U") && !user.getItemFromInventory(user.availableItems[cur.right.event]).equals(user.availableItems[cur.right.event])){
                    System.out.println("");
                    System.out.println("\t\t[Message] You dont have " + user.availableItems[cur.right.event]);
                            
                }else if(answer.equals("I")){
                    int survive = rand.nextInt(2);
                    if(survive == 0){
                        cur = cur.right;
                        cur.event = -1;
                        spr.printRoom(cur);
                        answer = controller.checkInput("P"); 
                        user.addRoomKeysToUser(cur);
                        user.setUserItem(cur.item);
                        spr.Hallway(cur, user);
                        handle = false;
                    }else{
                        spr.printGameOver();
                        cur.playing = false;
                        handle = false;
                    }
                }

            }
        }

        return cur;
    }

    public static void FinalBoos(Sprites ss){
        Input controller = new Input();

        ss.printDragon();
        String ans = controller.checkInput("Q", "E", "R");
        if(ans.equals("Q")){
          ss.printDeath();
        }else if(ans.equals("E")){
          ss.printDeath2();
        }else {
          ss.printDragonTamer();
          ans = controller.checkInput("P");
          ss.printWon();
        }
    }

}
