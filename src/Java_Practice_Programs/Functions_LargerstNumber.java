package Java_Practice_Programs;

public class Functions_LargerstNumber {

    static int largeNumber(int a, int b) {
        if (a > b) {
            return a;
        }
        else return b;
    }

    public static void main(String[] args) {
        int result = largeNumber(10,10);
        System.out.println("The larger number is :" + result);
    }
}
