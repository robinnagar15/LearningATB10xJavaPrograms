package ex_10_SwitchBasics;

public class Lab069_JDK13Concept {
    public static void main(String[] args) {

        int itemCode=003;

        switch (itemCode){
            case 001,002,004:
                System.out.println("This is one of electronic gadgets");
                break;
            case 007,005,006:
                System.out.println("Mechanical gadget");
                break;
            default:
                System.out.println("Not in the list");
        }
    }
}
