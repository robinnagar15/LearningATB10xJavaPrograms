package ex_15_String;

public class Lab090_String {
    public static void main(String[] args) {

        String s1="Hello";
        //s1.concat("World"); //Print "Hello" only until assigned

        s1=s1.concat("World"); //Now prints "HelloWorld" after assignment
        System.out.println(s1);
    }
}
