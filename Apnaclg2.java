/*In a program, input the side of a square. 
You have to output the area of the square. */
import java.util.*;
public class Apnaclg2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r");
        float r = sc.nextFloat();
        double pi = 3.14;
        System.out.println("Area of square is:");
        double area = pi*r*r;
        System.out.println(area);
    }
}