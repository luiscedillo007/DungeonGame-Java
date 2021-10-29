import java.util.Random;
import java.util.Scanner;

public class newGame {

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

    public static void main(String[] args) {
        play();
    }


    public static void play(){

        Room Root = new Room(true, 50, "Main Hallway");
        Root.addRoom(false, 40, "Level 1: Door A");
        Root.addRoom(false, 60, "Level 1: Door B");
        Root.addRoom(false, 30, "Level 2: Door A");
        Root.addRoom(false, 45, "Level 2: Door B");
        Root.addRoom(false, 55, "Level 2: Door C");
        Root.addRoom(false, 65, "Level 2: Door D");


        Room cur = Root;
        boolean playing = true;
        System.out.println(Root.getInfo());
        
        while(playing){
            
            System.out.println("Back: A | Left: B | Right: C");
            String answer = checkInput("A", "B", "C");

            if(answer.equals("A")){
                if(!cur.startingPoint){
                    System.out.println(cur.parent.getInfo());
                    cur = cur.parent;
                }else{
                    System.out.println("You are at the start!");
                    System.out.println(cur.getInfo());
                }
            }else if(answer.equals("B")){
                if(cur.left!= null){
                    System.out.println(cur.left.getInfo());
                    cur = cur.left;
                } 
                else{
                    System.out.println("Try another option please");
                    System.out.println(cur.getInfo());
                } 
            }else if(answer.equals("C")){
                if(cur.right != null){
                    System.out.println(cur.right.getInfo());
                    cur = cur.right;
                } 
                else{
                    System.out.println("Try another option please");
                    System.out.println(cur.getInfo());
                } 
            }

        }


        //Root.printTreeOfRooms();
        //System.out.println(Root.parent.getInfo());
    }

}
