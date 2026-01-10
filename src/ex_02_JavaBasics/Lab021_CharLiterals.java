package ex_02_JavaBasics;

public class Lab021_CharLiterals {
    public static void main(String[] args) {

        //char literals

        char c1='A';
        char c2='B';
        char c3='@';

        //Escape characters

        char new_line='\n';
        char tab='\t';
        char back_space='\b';
        char car_r='\r'; //carriage return

        System.out.println("Robin" + new_line + "Nagar");
        System.out.println("Robin" + "Nagar");

        System.out.println("Robin" + tab + "Nagar");
        System.out.println("Robin" + back_space + "Nagar");

        System.out.println("------------");
        System.out.println("Robin" + car_r + "Nagar");
    }
}
