package classandObject;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student = new Student();
        System.out.println(STR."name: \{student.name}");
        System.out.println(STR."username \{student.username}");
        student1.printWelcome();
        student.printWelcome();
        student.printWelcome(2099);


    }

}
