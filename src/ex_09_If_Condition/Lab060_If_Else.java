package ex_09_If_Condition;

import java.util.Scanner;

public class Lab060_If_Else {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        int age= sc.nextInt();

        if(age>18){
            System.out.println("You are allowed to vote");
        }
        else{
            System.out.println("Not allowed");
        }
    }
}
