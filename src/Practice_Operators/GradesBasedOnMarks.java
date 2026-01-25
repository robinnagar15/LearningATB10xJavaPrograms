package Practice_Operators;

public class GradesBasedOnMarks {
    public static void main(String[] args) {

        int marks= 49;

        String grade= (marks>=90)?"A":(marks>=75)? "B": (marks>=50)? "C": "Fail";
        System.out.println("The received Grade is: " + grade);
    }
}
