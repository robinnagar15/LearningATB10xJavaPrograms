package ex_17_Arrays;

public class Lab107_ForEachLoop {
    public static void main(String[] args) {

        int[]a=new int[3];

        a[0]=90;
        a[1]=91;
        a[2]=92;

        //for( int i=0; i<a.length; i++){
          //  System.out.println(a[i]);

        for(int i:a){
            System.out.println(i);
        }
        }
    }

