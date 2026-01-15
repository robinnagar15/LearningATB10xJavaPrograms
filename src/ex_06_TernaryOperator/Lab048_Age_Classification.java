package ex_06_TernaryOperator;

public class Lab048_Age_Classification {
    public static void main(String[] args) {

        int age=66;

        // adult. minor, senior
        //senior >65 , minor <18, adult >18

        String result = (age<18)? "Minor" : (age<65)? "Adult": "Senior";
        System.out.println(result);
    }
}
