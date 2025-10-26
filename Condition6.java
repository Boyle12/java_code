/*TERNARY OPERATOR. */
import java.util.*;
public class Condition6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System .in);
        System.out.println("Enter any no :");
        double number = sc.nextDouble();
        String type = ((number%2)==0)?"even" : "odd";
        System.out.println(type);
    }
}
