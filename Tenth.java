public class Tenth {
    public static void main(String[] args){
    //Array
    int age = 30;
    int phy = 97 ;
    int chem = 98;
    int maths = 95;

    int[] marks = new int[3];
    // [] is used for array.
    // array is no primitive so we write (new).
    // int[3] mean we want integer type data with memory space 3
    marks[0] = 97;
    marks[1] = 98;
    marks[2] = 95;

    System.out.println(marks[0]);
    //when we write only marks it gives garbage value.eg-marks;
    //but when we allocate the marks then it gives original value 
    }
}
