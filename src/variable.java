//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class variable {
    public static void main(String[] args) {
        int age = 19;
        int Age = 20;
        int AGE = 21;
        int AgE = 22;
        System.out.println(age);
        System.out.print("Age");
        System.out.println(Age);
        System.out.print("AGE");

        //numbers and sysmbols are not allowed
        //
        String name = "Hor";
        String $name = "Hor";
        String _name = "Hor";
        System.out.println(name);
        System.out.println($name);
        System.out.println(_name);


        int speedLimit = 80;
        System.out.println("speedLimit");
        speedLimit = 40;
        System.out.println(speedLimit);

        //local variales
        //local variables = a variables defined inside a method ,
        //primitive data type are the basic built-in types in java.
        boolean isSingle = true;
        System.out.println("isSingle");

        float pi = 3.1484927404f;
        System.out.println("pi");

        //00000000
        int a = 10;
        String aBinary = Integer.toBinaryString(a);

        //string method
        String s1 = "Welcome back ";
        String s1Substring = "Welcome back ";
        int s1Length = s1.length();
        char s1Char = s1.charAt(6);
        String s2 = "Me";
        boolean s1Bool = s1.contains(s2.toLowerCase());
        System.out.println(s1Bool);
        System.out.println("s1 length");
        System.out.println(s1Char);
        System.out.println("S1Substring");


    }
}