package Java_Practice_Programs;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        final int passMarks = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= passMarks) {
            System.out.println("Pass");
        }
            else {
                System.out.println("Fail");
            }

        }
    }
