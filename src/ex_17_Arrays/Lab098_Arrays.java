package ex_17_Arrays;

public class Lab098_Arrays {
    public static void main(String[] args) {

        //Pre-defined
        int [] marks={1,2,3,4,5};

        //Another way, fixed size
        int [] marks2= new int[5];

        System.out.println(marks2.length);
        marks2[0]=1;
        marks2[1]=2;
        marks2[2]=3;
        marks2[3]=4;
        marks2[4]=5;

        System.out.println(marks2[0]);
        System.out.println(marks2[4]);
        System.out.println(marks2[3]);

        //System.out.println(marks2[-1]);
    }
}
