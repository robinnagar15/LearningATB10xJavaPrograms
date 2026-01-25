package Java_Practice_Programs;

import java.util.Scanner;

public class ResultPercentage {
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

        int total_marks=sub1+sub2+sub3+sub4+sub5;
        float percentage=(float)((total_marks/500.0)*100);
        System.out.println("The result percentage is :"+percentage);

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
