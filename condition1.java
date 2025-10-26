// print age is Adult or not
import java.util.*;
public class condition1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        float age = sc.nextFloat();
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }
    }
    
}
