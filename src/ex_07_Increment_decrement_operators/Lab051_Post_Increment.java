package ex_07_Increment_decrement_operators;

public class Lab051_Post_Increment {
    public static void main(String[] args) {

        int a=20;
        System.out.println(++a);
        System.out.println(a);

        //Post increment -> Print first then increase
        int a_post=10;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
