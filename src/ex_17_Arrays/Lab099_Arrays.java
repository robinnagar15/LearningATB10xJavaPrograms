package ex_17_Arrays;

import java.util.Arrays;

public class Lab099_Arrays {
    public static void main(String[] args) {

        int[] marks = {51,87,100,90,76};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //Print using for loop

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        //System.out.println(marks[i]);

    }
}