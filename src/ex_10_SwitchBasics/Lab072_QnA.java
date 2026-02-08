package ex_10_SwitchBasics;

public class Lab072_QnA {
    public static void main(String[] args) {

        char code='C';
        switch (code){
            default:
                System.out.println("Default value");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
        }
    }
}
