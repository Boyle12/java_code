import java.util.*;
public class Condition10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please click on only 1 or 2 or 3");
        int number = sc.nextInt();
        // using switch statement
        switch (number) {
            case 1 : System.out.println("you are mad");
                     break;
            case 2 : System.out.println("you are cheater");
                     break;
            case 3 : System.out.println("you are smart");
                     break;
            default: System.out.println("Thank you for clicking, but choose correct option");
                     break;
            
        }
    }    
}
