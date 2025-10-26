// sum of first n natural no
// sum of first n natural no
import java.util.*;

public class Condition17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int range = sc.nextInt();

        int counter = 1;  // start from 1
        int sum = 0;

        while (counter <= range) {
            sum += counter;          // add counter to sum
            counter++;               // increment counter
        }

        System.out.println("Sum of first " + range + " natural numbers is: " + sum);
    }
}

