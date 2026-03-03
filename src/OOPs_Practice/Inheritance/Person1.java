package OOPs_Practice.Inheritance;

public class Person1 {
    String name;

    Person1(String name){
        this.name = name;
        System.out.println("Parent constructor called");
    }
    void displayName(){
        System.out.println("Name is: " + name);
    }
}

class Employee extends Person1{
    int age;
    Employee(String name, int age){
        super(name);
        this.age=age;
        System.out.println("Employee constructor called");
    }
    void displayDetails(){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

    }
}
