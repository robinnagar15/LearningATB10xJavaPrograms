package ex_09_If_Condition;

import java.util.Scanner;

public class Lab064_TriangleClassifier {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of side1");
        double side1= sc.nextDouble();
        System.out.println("Enter the length of side2");
        double side2= sc.nextDouble();
        System.out.println("Enter the length of side3");
        double side3= sc.nextDouble();

        if(side1<=0 || side2<=0 ||side3<=0){
            System.out.println("Invalid input: Provide positive value for length");
        }else{

        if(side1==side2 && side2==side3 && side3==side1){
            System.out.println("This is Acute triangle");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("This is isosceles triangle");
        }else{
            System.out.println("This is scalene triangle");
        }
        sc.close();

    }
}}
