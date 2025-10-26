import java.util.*;
public class Condition9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks =sc.nextInt();
        
        String reportcard = marks>=33 ? "pass" : "Fail";
        System.out.println(reportcard);
    }
}
