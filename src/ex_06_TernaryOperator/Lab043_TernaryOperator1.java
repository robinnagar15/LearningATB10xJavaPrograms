package ex_06_TernaryOperator;

public class Lab043_TernaryOperator1 {
    public static void main(String[] args) {

        //result = condition ? expression 1:expression 2

        int age=19;

        String can_I_vote = age>=18 ? "Yes, you can vote" : "Not eligible";
        System.out.println(can_I_vote);
    }
}
