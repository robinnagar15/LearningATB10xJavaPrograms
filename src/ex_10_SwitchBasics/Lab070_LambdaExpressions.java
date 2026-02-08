package ex_10_SwitchBasics;

public class Lab070_LambdaExpressions {
    public static void main(String[] args) {

        int itemCode=002; //JDK>13

        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 006 -> System.out.println("006");
            default -> System.out.println("Out of stock");
        }
    }
}
