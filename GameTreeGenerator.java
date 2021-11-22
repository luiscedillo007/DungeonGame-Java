import java.util.Random;
public class GameTreeGenerator {
    
    public Room root;
    public Key gameKeys;

    public GameTreeGenerator(Key gameKeys, int maxDepth){
        root = new Room("Main Hallway", gameKeys.emptyKey, gameKeys.emptyInside);
        root.parent = root;
        root.event = -1;
        root.curDepth = 0;
        root.dragonLayer = false;
        root.flag = false;
        root.item = "";
        this.gameKeys = gameKeys;
        GenerateTree(root, maxDepth, root.curDepth);
    }

    public void GenerateTree(Room cur, int maxDepth, int curDepth){
        if(maxDepth > 0){
            curDepth++;

            Random rand = new Random();
            int isLeft = rand.nextInt(4);
            int isRight = rand.nextInt(4);

            if(isLeft != 0){
                cur.left = new Room(createRandomRoomName(), gameKeys.getRandomKey(curDepth), gameKeys.getRandomKeysInsideRoom(), randomEvent(), cur, curDepth, randomItem(), dragonLayer(maxDepth, true), false);
                GenerateTree(cur.left, maxDepth-1, curDepth);
            }

            if(isRight != 0){
                cur.right = new Room(createRandomRoomName(), gameKeys.getRandomKey(curDepth), gameKeys.getRandomKeysInsideRoom(), randomEvent(), cur, curDepth, randomItem(), dragonLayer(maxDepth, false), false);       
                GenerateTree(cur.right, maxDepth-1, curDepth);
            }
        }
    }

    public String createRandomRoomName(){
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

    public int randomEvent(){
        Random rand = new Random();
        int hasEvent = rand.nextInt(10);

        if(hasEvent == 0){
            int event = rand.nextInt(3);
            return event;
        }

        return -1;

    }

    public static String randomItem(){
        Random rand = new Random();
        int hasItem = rand.nextInt(5);
        if(hasItem == 0){
            String[] items = {"Lucky Charm", "Book of Spells", "Sword"};
            int randomItem = rand.nextInt(items.length);
            return items[randomItem];
        }
        return "";
    }

    public boolean dragonLayer(int curDepth, boolean isLeft){
        if(curDepth - 1 == 0 && isLeft) return true;
        return false;
    }


}
