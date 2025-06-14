package nestedClass;

import java.util.Scanner;
import java.util.UUID;

public class demoNested {
    // state
    String id;
    String name;
    int age;
    String address;

    // behavior
    void showInfo() {
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }

    void createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name :");
        String name = scanner.nextLine();
        System.out.println("Enter age :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address :");
        String address = scanner.nextLine();
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.address = address;
    }



}
