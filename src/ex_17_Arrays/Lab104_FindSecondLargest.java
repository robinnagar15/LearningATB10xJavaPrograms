package ex_17_Arrays;

import java.util.Arrays;

public class Lab104_FindSecondLargest {
    public static void main(String[] args) {

        int[] numbers={12,10,34,80,75,67};
        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-2]);
    }
}
