// print no 1 to n where n is given by user
import java.util.*;
public class Condition15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int range = sc.nextInt();
        int counter = 1;

        while (counter<=range) {
            System.out.println(counter);
            counter++;           
        }
    }
}