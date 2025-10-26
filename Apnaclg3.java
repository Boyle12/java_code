/*Enter cost of 3 items from the user (using float data type) - 
a pencil, a pen and an eraser. You have to output the total cost 
of the items back to the user as their bill. */
import java.util.*;
public class Apnaclg3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter cost of pen");
        float pen = sc.nextFloat();
        System.out.println("Enter cost of Eraser");
        float Eraser = sc.nextFloat();
        double Total = pencil + pen + Eraser;
        System.out.println("Total");
        System.out.println(Total);
        
    }
}