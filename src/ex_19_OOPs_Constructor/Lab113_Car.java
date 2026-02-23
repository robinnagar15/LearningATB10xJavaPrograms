package ex_19_OOPs_Constructor;

public class Lab113_Car {
    public static void main(String[] args) {

        Car tesla=new Car();
        System.out.println(tesla.name);

        tesla.name="Tesla";
        tesla.model="Top";
        tesla.year=2025;
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car nano=new Car();
        nano.name="Tata nano";
        System.out.println(nano.name);
    }
}
