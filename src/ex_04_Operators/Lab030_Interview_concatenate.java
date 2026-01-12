package ex_04_Operators;

public class Lab030_Interview_concatenate {
    public static void main(String[] args) {

        String first_name="Robin";
        String last_name="nagar";
        int a=10;
        int b=20;

        System.out.println(first_name+last_name+a+b); //Robinnagar1020
        System.out.println(a+b+first_name+last_name); //30Robinnagar
        System.out.println(first_name+last_name+(a+b)); //Robinnagar30
    }
}
