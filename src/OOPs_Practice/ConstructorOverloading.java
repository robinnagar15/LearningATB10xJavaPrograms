package OOPs_Practice;

public class ConstructorOverloading {
    String name;
    int salary;

    ConstructorOverloading() {
        System.out.println("Default constructor called");
    }

    ConstructorOverloading(String name) {
        name = name;
        salary = 0;
    }

    public ConstructorOverloading(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Salary is: " + salary);
    }
}

