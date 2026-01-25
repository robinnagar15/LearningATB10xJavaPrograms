package Practice_Operators;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {

        int num=-13;

        String result=(num < 0) ? "Negative" : (num > 0) ? "Positive" : "Zero";
        System.out.println(result);

    }
}
