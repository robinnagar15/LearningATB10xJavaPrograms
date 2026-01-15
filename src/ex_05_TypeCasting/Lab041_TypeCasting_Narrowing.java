package ex_05_TypeCasting;

public class Lab041_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int a=200;

       //byte b=a; // Implicit -> invalid
        byte b=(byte)a; //Explicit -> valid
        System.out.println(b);
    }
}
