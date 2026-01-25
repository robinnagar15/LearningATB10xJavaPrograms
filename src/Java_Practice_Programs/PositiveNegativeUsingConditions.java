package Java_Practice_Programs;

import java.util.Scanner;

public class PositiveNegativeUsingConditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else if (number == 0) {
            System.out.println("Number is zero");
        }

    }
}
