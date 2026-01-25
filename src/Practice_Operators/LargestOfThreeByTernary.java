package Practice_Operators;

public class LargestOfThreeByTernary {
    public static void main(String[] args) {

        int a=10, b=11, c=9;

        String largestNumber= (a>b && a>c)? "a is largest": (b>a && b>c)? "b is largest":"c is largest";
        System.out.println(largestNumber);
    }
}
