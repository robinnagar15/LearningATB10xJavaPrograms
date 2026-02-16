package ex_16_String_Functions;

public class Lab096_StringFunctions {
    public static void main(String[] args) {

        String name="Sonal";

        //1. length()
        System.out.println(name.length());
        //2. charAt()
        System.out.println(name.charAt(3));
        //3. concat ()
        System.out.println(name.concat("Patel"));
        //4. contains()
        System.out.println(name.contains("on"));
        //5. equals()
        System.out.println(name.equals("Sonal"));
        //6. equalsIngorecase()
        System.out.println(name.equalsIgnoreCase("sonal"));
        //7.indexOf()
        System.out.println(name.indexOf("n"));
        //8. replace()
        System.out.println(name.replace('n', 'N'));
        //9. split()
        String name4 = "Ritik@live.com@123";
        String[] split=name4.split("@");
        System.out.println();
    }
}
