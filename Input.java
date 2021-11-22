import java.util.Scanner;
public class Input {
    
    public Input(){}

    public String checkInput(String a, String b, String c) {
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

    public String checkInput(String a) {
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

    public int checkNIntInput(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n <= 0){
          System.out.println("");
            System.out.print("\t\t[*] Please enter number of Keys: ");
          try{ 
            String line = sc.nextLine();
            n = Integer.parseInt(line);
          } catch(NumberFormatException e){
            System.out.println("");
            System.out.println("\t\t[Error] Incorrect input, please input a positive number.");
          }
        }
        return n;
    }

    public int checkMIntInput(){
        Scanner sc = new Scanner(System.in);
        int m = 0;
        while(m <= 1){
          System.out.println("");
            System.out.print("\t\t[*] Please enter number of Rooms: ");
          try{ 
            String line = sc.nextLine();
            m = Integer.parseInt(line);
          } catch(NumberFormatException e){
            System.out.println("");
            System.out.println("\t\t[Error] Incorrect input, please input a positive number. Greater than 1");
          }
        }
        return m;
    }

}
