package ex_05_TypeCasting;

public class Lab040_TypeCasting {
    public static void main(String[] args) {
         byte b=10;
        // int a=b; //Implicit -> Automatically by compiler

        int a= (int)b; //Explicit casting

        System.out.println(a);
    }
}
