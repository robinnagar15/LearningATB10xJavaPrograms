package OOPs_Practice;

class Car {

    String brand;
    double price;

    void displayCarDetails() {
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand="BMW";
        c1.price=1999;
        c1.displayCarDetails();
    }
}
