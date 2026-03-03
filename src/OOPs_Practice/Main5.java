package OOPs_Practice;

public class Main5 {
        public static void main(String[] args) {

            ConstructorOverloading c1 = new ConstructorOverloading();
            ConstructorOverloading c2 = new ConstructorOverloading("Robin");
            ConstructorOverloading c3 = new ConstructorOverloading("Robin",250000);
            
            c1.display();
            c2.display();
            c3.display();

        }
    }
