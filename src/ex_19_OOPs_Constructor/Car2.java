package ex_19_OOPs_Constructor;

public class Car2 {

    String model;
    int year;

    Car2(){
        System.out.println("Default Constructor");
    }

    Car2(String model_name,int year_creation){
        this.model=model_name;
        this.year=year_creation;
    }
}
