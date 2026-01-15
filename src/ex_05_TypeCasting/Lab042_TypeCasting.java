package ex_05_TypeCasting;

public class Lab042_TypeCasting {
    public static void main(String[] args) {

        long phone_number=9876543210l;

       // short s=phone_number; //Implicit -> Not possible

        short s= (short) phone_number; //Explicit -> possible with data loss
    }
}
