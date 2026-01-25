package Java_Practice_Programs;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber= sc.nextInt();

        System.out.println("Enter second number");
        int secondNumber= sc.nextInt();

        int sum=firstNumber+secondNumber;
        System.out.println("Sum of provided numbers is :"+ sum);
    }


}
