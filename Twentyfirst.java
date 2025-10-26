// import java.util.Arrays;
import java.util.Scanner;
    public class Twentyfirst {
        public static void main(String[] args){
            // conditional operator
            Scanner sc = new Scanner(System.in);
            // pen = 10 ; notebook = 40
            System.out.println("Enter the amount");
            
            int cash = sc.nextInt();
            if(cash < 10 ){
            System.out.println("can;t buy anything");
            System.out.println("get more cash");
            }
            
            else if(cash > 10 && cash < 50){
                System.out.println("can buy only one product");
            }
                else{
                System.out.println("can buy both product");
            }
            sc.close();
        }
    }
    
