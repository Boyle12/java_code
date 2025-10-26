import java.util.Arrays;
public class Eleventh {

    public static void main(String[] args){
        int age = 30;
        int phy = 97;
        int chem = 99;
        int maths = 98;

        int[] marks = new int[3];
        marks [0] = 97;
        marks [1] = 99;
        marks [2] = 98;
        System.out.println(marks[1]);
        // find length
        //System.out.println(marks.length);
        // in array we dont use length with paranthisis.eg-length()

        // sorting in ascending order
        Arrays.sort(marks);
        // when we have to sort array then we have to write import java.util.Arrays;
        System.out.println(marks[1]);
    } 
}
