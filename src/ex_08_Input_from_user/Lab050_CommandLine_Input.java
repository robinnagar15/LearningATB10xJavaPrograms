package ex_08_Input_from_user;

public class Lab050_CommandLine_Input {

    public static void main(String[] args) {

        String age_string= args[0];
        int age=Integer.parseInt(age_string);
        System.out.println(age);

        String can_I_Go_Goa= (age>=24)? "Yes":"No";
        System.out.println(can_I_Go_Goa);


    }
}
