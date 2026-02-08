package Java_Practice_Programs;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of 1st subject");
        int sub1= sc.nextInt();
        System.out.println("Enter the marks of 2nd subject");
        int sub2= sc.nextInt();
        System.out.println("Enter the marks of 3rd subject");
        int sub3= sc.nextInt();
        System.out.println("Enter the marks of 4th subject");
        int sub4= sc.nextInt();
        System.out.println("Enter the marks of 5th subject");
        int sub5= sc.nextInt();

        if(     sub1<0 || sub1>100||
                sub2<0 || sub2>100||
                sub3<0 || sub3>100||
                sub4<0 ||sub4>100 ||
                sub5<0 ||sub5>100) {
            System.out.println("Invalid marks entered");
            return;
        }
        int total_marks=sub1+sub2+sub3+sub4+sub5;
        double percentage=(total_marks/500.0)*100;
        System.out.println("The result percentage :"+percentage);

        if(percentage>=75) {
            System.out.println("Distinction");
        } else if (percentage>=60) {
            System.out.println("First class");
        } else if (percentage>=40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }

    }
