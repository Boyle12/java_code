/*In a program, input 3 numbers : A, B and C. You have to 
output the average of these 3 numbers.*/
import java.util.*;
public class Apnaclg1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = sc.nextFloat();
        System.out.println("Enter b:");
        float b = sc.nextFloat();
        System.out.println("Enter c:");
        float c = sc.nextFloat();
        float average = (a+b+c)%3;
        System.out.println("Average is:");
        System.out.println(average);
    }

}
