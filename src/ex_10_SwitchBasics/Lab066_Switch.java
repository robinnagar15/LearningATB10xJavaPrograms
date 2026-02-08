package ex_10_SwitchBasics;

import java.util.Scanner;

public class Lab066_Switch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browserName= sc.next();

        switch(browserName){
            case "Chrome":
                System.out.println("Starting the execution on chrome");
                break;
            case "Firefox":
                System.out.println("Starting the execution on firefox");
                break;
            case "Edge":
                System.out.println("Starting the execution on edge");
                break;
            default:
                System.out.println("This browser is not available");
        }
    }
}
