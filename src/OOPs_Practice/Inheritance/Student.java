package OOPs_Practice.Inheritance;

class Student extends Person {

    Student(String name) {
        super(name);
        System.out.println("Student constructor called");
    }
    

    public class Main{
        public static void main(String[] args) {

            Student s1 = new Student("Robin");
        }
    }
}

