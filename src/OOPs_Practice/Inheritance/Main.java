package OOPs_Practice.Inheritance;

class Dog extends Animal{

    Dog(String name) {
        super(name);
    }
    void eat(){
        System.out.println("Dog is eating"); //Overriding
    }
    void eat(int times){
        System.out.println("Dog ate "+times+" times"); //Overloading
    }
}
public class Main{
    public static void main(String[] args) {

        Animal a=new Dog("Tommy");
        a.eat();

        Dog d=new Dog("Moti");
        d.eat();
        d.eat(4);

    }
}

