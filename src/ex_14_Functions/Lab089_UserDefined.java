package ex_14_Functions;

public class Lab089_UserDefined {
    public static void main(String[] args) {

        //Without parameters & without return type

        main();
        greet();//Calling the function

    }
     static void main(){    //Declaration
         System.out.println("Another replica of main");
     }

     static void greet(){
         System.out.println("Hey, how are you");
     }


}
