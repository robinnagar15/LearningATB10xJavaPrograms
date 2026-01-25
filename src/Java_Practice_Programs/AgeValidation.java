package Java_Practice_Programs;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        if (age<0) {
            System.out.println("Invalid age");
        } else if (age>=18){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }

    }}
