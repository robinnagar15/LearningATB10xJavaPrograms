package ex_17_Arrays;

public class Lab103_SumUsingForEach {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int sum=0;

        for(int n:numbers){
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
