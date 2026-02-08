package ex_11_ForLoop;

public class Lab082_EvenNumbersUsingContinue {
    public static void main(String[] args) {

        for (int i = 0; i <= 25; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number is: " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
