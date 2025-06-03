package javaMethod;

public class methodP {
    public static void printHello(int count) {
        if (count == 0) return;
        System.out.println("Hello");
        printHello(count - 1);

    }



}
