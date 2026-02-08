package ex_11_ForLoop;

public class Lab080_BreakInForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
