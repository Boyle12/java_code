/*Write a Java program to get a number from the user and print whether 
it is positive or negative./* */
import java.util.*;
public class Condition4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        float number = sc.nextFloat();
        if(number>0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }
    }
}
