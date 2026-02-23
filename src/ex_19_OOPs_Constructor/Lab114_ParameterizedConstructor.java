package ex_19_OOPs_Constructor;

public class Lab114_ParameterizedConstructor {
    public static void main(String[] args) {

        Mobile iPhone = new Mobile("iPhone 12", "2014");
        System.out.println(iPhone.model_name);
        System.out.println(iPhone.year_launch);

        Mobile OnePlus = new Mobile("OnePlus Lite", "2018");
        System.out.println(OnePlus.model_name);
        System.out.println(OnePlus.year_launch);

        iPhone.display();
        OnePlus.display();
    }
    }

    class Mobile{
        String model_name;
        String year_launch;

        Mobile(String model_name,String year_launch){
            this.model_name=model_name;
            this.year_launch=year_launch;
        }

        void display(){
            System.out.println(model_name+"--- "+year_launch);
        }
    }
