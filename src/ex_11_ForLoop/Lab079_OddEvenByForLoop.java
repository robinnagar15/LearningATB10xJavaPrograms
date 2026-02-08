package ex_11_ForLoop;

public class Lab079_OddEvenByForLoop {
    public static void main(String[] args) {

        //To find even & odd numbers from 1 to 50
        for (int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even number -> " +i);
            }
            else {
                System.out.println("Odd number -> " +i);
            }
        }
    }
}
