import java.util.Scanner;

public class homeWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Monthly salary in KHR:");
        double salary = scanner.nextDouble();
        double taxRate;

        System.out.println("Enter Monthly salary in KHR:" + salary +" KHR");
        if(salary <= 1500000){
            taxRate = 0.01;
        }else if(salary <= 20000000){
            taxRate = 0.05;

        }
        else if (salary <= 8500000){
            taxRate = 0.10;
        }
        else if (salary <= 12500000){
            taxRate = 0.15;
        }
        else{
            taxRate = 0.20;
        }
        double taxAmount = salary * taxRate;
        System.out.println("Your applicable tax rate: " + (taxRate * 100) + "%");
//        System.out.println("Tax amount to be paid: " + taxAmount + " KHR");

        scanner.close();


    }
}
