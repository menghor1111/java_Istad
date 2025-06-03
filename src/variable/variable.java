package variable;

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
        System.out.println(AGE);
        System.out.println(AgE);

        //numbers and symbols are not allowed
        // _ , $
        String name = "Hor";
        String $name = "Hor";
        String _name = "Hor";
        System.out.println(name);
        System.out.println($name);
        System.out.println(_name);


        // manipulate a variable
        int SpeedLimit = 80;
        System.out.println("speedLimit");
        SpeedLimit = 40;
        System.out.println(SpeedLimit);

        int ages = 20;
        System.out.println(ages);
        ages = 22;
        System.out.println(ages);

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

        // promotion: converts from smaller size to bigger size data type
        int id = 333;
        long idLong = id;
        System.out.println(idLong);

        //casting
        long longVar = 15;
        int ingvar = (int) longVar ;

        //autoboxing: converts from primitive to wrapper class
        int aged = 18;
        Integer wrapperAge = aged;
        System.out.println(wrapperAge);

        //unboxing : converts from wrapper class to primitive
        Integer year = 2025;
        int intYear = year;
        System.out.println(intYear);





    }
}