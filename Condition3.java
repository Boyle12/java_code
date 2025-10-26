//Find Even or odd 
import java.util.*;
public class Condition3 {
    public static void main(String args[]){
        // print if no. is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("press a no.");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
