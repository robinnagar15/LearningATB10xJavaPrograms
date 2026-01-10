package ex_02_JavaBasics;

public class Lab015_printf {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a);

        System.out.printf("The value of a is %d",a);

        // %d -> for integer
        // %s -> string
        // %f -> float  , %b -> boolean

        byte b=15;
        System.out.println("---------");
        System.out.printf("%d", b);
    }
}
