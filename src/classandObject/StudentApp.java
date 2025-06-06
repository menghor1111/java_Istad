package classandObject;

import java.util.Scanner;


public class StudentApp {
    /**
     * There are 4 type of method in java
     * 1.Method with no return type, no parameter
     * 2.Method with no return type, with parameter
     * 3.Method with return type, no parameter
     * 4. method with return type, with parameter
     * */
    static String[] students = {"MengHor", "Sreynich", "MengChuan"};

    public static void main(String[] args) {
        StudentApp app = new StudentApp();
        Scanner scanner = new Scanner(System.in);


        app.printLabel();
        app.printTitle("to my System");
        String studentName;
        do{
            System.out.print("Enter student name: ");
            studentName = scanner.nextLine();
        }while(!app.checkIfStudentExists(studentName));



        System.out.print("Enter Student name: ");
        String StudentName = scanner.nextLine();
        boolean isExist = app.checkIfStudentExists(StudentName);
        System.out.print("Enter math score: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Enter khmer score: ");
        double khmerScore = scanner.nextDouble();
        System.out.print("Enter English score: ");
        double englishScore = scanner.nextDouble();

        app.showStudentInfo(studentName, mathScore, khmerScore, englishScore);
    }


    void printLabel(){
        System.out.println("""
                ██╗███████╗████████╗ █████╗ ██████╗          ██╗ █████╗ ██╗   ██╗ █████╗    \s
                ██║██╔════╝╚══██╔══╝██╔══██╗██╔══██╗         ██║██╔══██╗██║   ██║██╔══██╗   \s
                ██║███████╗   ██║   ███████║██║  ██║         ██║███████║██║   ██║███████║   \s
                ██║╚════██║   ██║   ██╔══██║██║  ██║    ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║   \s
                ██║███████║   ██║   ██║  ██║██████╔╝    ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║   \s
                ╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═════╝      ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝   \s

                """
        );
    }
    //2. Method with no return type, with parameter
    void printTitle(String title){
        System.out.println("================| Welcome to "+ title  + " |==============");
        System.out.println("Total");

    }
    void showStudentInfo(String name, double math, double khmer, double english){
        System.out.println("=".repeat(30));
        System.out.println("Student name: " + name);
        System.out.println("Student math score: " + math);
        System.out.println("Student khmer score: " + khmer);
        System.out.println("Student english score: " + english);
        System.out.println("-".repeat(30));
        double totalScore = calculateTotal(math, khmer, english);
        System.out.print("Total score is: "+ totalScore);

    }
    //3. Method with return type, no parameter
    int getTotalStudent(){
        return students.length;
    }
    //4. Method with return type, with parameter
    double calculateTotal(double math, double khmer, double english){
        return math + khmer + english;
    }
    boolean checkIfStudentExists(String name){
        for(String student: students){
            if(student.equals(name)){
                return true;
            }else{
                System.out.println("Student doesn't exist ");
                System.out.println("Try again!!!");
                return false;
            }
        }
        return false;
    }


}
