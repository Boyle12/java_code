/*Finish the following code so that it prints You have a fever if your 
temperature is above 100 and otherwise prints You don't have a fever. */
import java.util.*;
public class Condition5 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your temperature");
        double temperature = sc.nextDouble();
        if(temperature>100){
            System.out.println("Fever");
        }
        else{
            System.out.println("No Fever");
        }
    }
}
