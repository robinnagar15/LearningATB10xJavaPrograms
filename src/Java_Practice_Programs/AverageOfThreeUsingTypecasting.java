package Java_Practice_Programs;

import java.util.Scanner;

public class AverageOfThreeUsingTypecasting {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a as integer");
        int a= sc.nextInt();
        System.out.println("Enter the value of b as integer");
        int b= sc.nextInt();
        System.out.println("Enter the value of c as integer");
        int c= sc.nextInt();

        float average=(float)(a+b+c)/3;
        //float totalAverage= (float)average;

        System.out.println("Average of provided numbers is :"+ average);

    }
}
