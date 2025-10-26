//Find greater b/w them by user defined 
import java.util.*;
public class Condition2 {
    public static void main(String args[]){
        //Print largest b/w two
        //int a =13;
        //int b =4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt(); 
        System.out.println("Rnter b");
        int b = sc.nextInt();
        if(a>=b){
            System.out.println("A is greater then B");
        }else{
            System.out.println("B is greater then A");
        }
    }
    
}
