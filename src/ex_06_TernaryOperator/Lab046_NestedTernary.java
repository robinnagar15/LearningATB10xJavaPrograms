package ex_06_TernaryOperator;

public class Lab046_NestedTernary {
    public static void main(String[] args) {

        int num=15;

        String result = (num > 10) ? (num > 20 ? "G>20":"B 10-20") : "B";

        System.out.println(result);
    }
}
