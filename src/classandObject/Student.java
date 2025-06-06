package classandObject;

public class Student {
    //1. Static Variable
    static String name = "Meng hor";
    //2. Instance Variable
    String username = "menghor";
    /**
     * There are 4 types of variable
     * 1. Static Variable
     * 2. Instance Variable
     * 3. Local Variable
     * 4. Parameter
     * */
    static void printWelcome(){
        //3. Local Variable
        int year = 2025;
        System.out.println("Welcome to class " + year);
    }
    // 4. Parameter
    void printWelcome(int year){

    }
}

