package Java_Practice_Programs;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
        for(;num!=0;num=num/10){
            reverse = reverse * 10 + num%10;
        }
        System.out.println(reverse);
        sc.close();
    }

}
