package homework;

import java.util.Scanner;

public class CaculateName {
    public static int getNumerologyNumber(String name) {
        int sum = 0;
        name = name.toUpperCase();
        for (char ch : name.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sum += (ch - 'A' + 1);
            }
        }

        while (sum > 9 && sum != 11 && sum != 22 && sum != 33) {
            sum = sum / 10 + sum % 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        int numerologyNumber = getNumerologyNumber(name);
        System.out.println("Numerology number for '" + name + "' is: " + numerologyNumber);
        scanner.close();
    }
}