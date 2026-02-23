package Java_Practice_Programs;

public class Functions_PrimeNumbers {

    static boolean primeNumber(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(15));
    }
}
