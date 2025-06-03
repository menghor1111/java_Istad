package homework;

import java.util.Scanner;

public class hallBooking {
    private static int[][] hallSeats;
    private static int showTime = 1000; // Default show time number
    private static StringBuilder history = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hall configuration
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of chairs per row: ");
        int chairs = scanner.nextInt();

        hallSeats = new int[rows][chairs]; // 0 means available, 1 means booked

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Booking");
            System.out.println("2. Hall");
            System.out.println("3. Show Time");
            System.out.println("4. Reboot Show Time");
            System.out.println("5. History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookSeat(scanner);
                    break;
                case 2:
                    showHall();
                    break;
                case 3:
                    System.out.println("Show Time: " + showTime);
                    break;
                case 4:
                    rebootShowTime(scanner);
                    break;
                case 5:
                    System.out.println("Booking History:\n" + history);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void bookSeat(Scanner scanner) {
        System.out.print("Enter row number (0-" + (hallSeats.length - 1) + "): ");
        int row = scanner.nextInt();
        System.out.print("Enter chair number (0-" + (hallSeats[0].length - 1) + "): ");
        int chair = scanner.nextInt();

        if (row >= 0 && row < hallSeats.length && chair >= 0 && chair < hallSeats[0].length) {
            if (hallSeats[row][chair] == 0) {
                hallSeats[row][chair] = 1;
                history.append("Booked: Row ").append(row).append(", Chair ").append(chair).append("\n");
                System.out.println("Seat booked successfully.");
            } else {
                System.out.println("Seat already booked.");
            }
        } else {
            System.out.println("Invalid seat selection.");
        }
    }

    public static void showHall() {
        System.out.println("Hall Seating (0 = available, 1 = booked):");
        for (int[] row : hallSeats) {
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public static void rebootShowTime(Scanner scanner) {
        System.out.print("Enter new show time number: ");
        showTime = scanner.nextInt();
        System.out.println("Show time updated.");
    }
}