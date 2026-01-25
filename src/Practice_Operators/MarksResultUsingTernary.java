package Practice_Operators;

public class MarksResultUsingTernary {
    public static void main(String[] args) {

        int marks=78;

        String examResult= (marks>=40) ? "Pass":"Fail";
        System.out.println(examResult);
    }
}
