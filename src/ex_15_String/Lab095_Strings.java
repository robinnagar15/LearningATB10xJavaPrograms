package ex_15_String;

import java.sql.SQLOutput;

public class Lab095_Strings {
    public static void main(String[] args) {

        String s1="Hello";
        String s5="Hello";

        String s2=new String("Hello");
        String s3=new String("Hello");
        String s6=new String("Hello");
        String s7=new String("hello");

        System.out.println(s1==s5);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s6==s7);

        System.out.println(s1.equals(s7));
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s1.equals(s3));
    }
}
