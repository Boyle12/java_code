import java.util.*;
public class Condition7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        Float income = sc.nextFloat();
        if(income<500000){
            System.out.println("You have to pay 0% tax");
        }
        else if (income>500000 && income < 1000000){
            System.out.println("You have to pay 20% tax");
        }
        else {
            System.out.println("You have to pay 30% tax");
        }
    }
}
