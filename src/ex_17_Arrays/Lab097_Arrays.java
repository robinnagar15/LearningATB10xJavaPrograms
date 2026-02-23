package ex_17_Arrays;

public class Lab097_Arrays {
    public static void main(String[] args) {

        int a=10; //not an array
        int [] marks={90,91,92,80,75}; //Array creation with pre-defined elements

        System.out.println(marks.length);
        System.out.println(marks[0]);

        //System.out.println(marks[-1]); //java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(marks[10]); //java.lang.ArrayIndexOutOfBoundsException


    }
}
