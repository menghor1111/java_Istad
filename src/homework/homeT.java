package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class homeT {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.print("Enter number of elements in array: ");
        int n = scanner.nextInt();

        System.out.print("Enter " + n + " elements:\n");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        ArrayList<Integer> originalOrder = new ArrayList<>(array);

        while (true) {
            System.out.println("\nChoose an option to perform operations:");
            System.out.println("1. Show Array");
            System.out.println("2. Sort Array");
            System.out.println("3. Reverse Sorted Array");
            System.out.println("4. Reverse Unsorted Array");
            System.out.println("5. Insert an Element");
            System.out.println("6. Update an Element");
            System.out.println("7. Delete an Element");
            System.out.println("0. Exit Program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Elements of array: " + array);
                    break;

                case 2:
                    Collections.sort(array);
                    System.out.println("Sorted Array: " + array);
                    break;

                case 3:
                    ArrayList<Integer> reverseSorted = new ArrayList<>(array);
                    Collections.sort(reverseSorted, Collections.reverseOrder());
                    System.out.println("Reverse Sorted Array: " + reverseSorted);
                    break;

                case 4:
                    ArrayList<Integer> reversedUnsorted = new ArrayList<>(originalOrder);
                    Collections.reverse(reversedUnsorted);
                    System.out.println("Reverse Unsorted Array: " + reversedUnsorted);
                    break;

                case 5:
                    System.out.print("Enter element to insert: ");
                    int insertElement = scanner.nextInt();
                    array.add(insertElement);
                    originalOrder.add(insertElement);
                    System.out.println("Element inserted.");
                    break;

                case 6:
                    System.out.print("Enter index to update (0 to " + (array.size() - 1) + "): ");
                    int updateIndex = scanner.nextInt();
                    if (updateIndex >= 0 && updateIndex < array.size()) {
                        System.out.print("Enter new value: ");
                        int newValue = scanner.nextInt();
                        array.set(updateIndex, newValue);
                        originalOrder.set(updateIndex, newValue);
                        System.out.println("Element updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 7:
                    System.out.print("Enter index to delete (0 to " + (array.size() - 1) + "): ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < array.size()) {
                        array.remove(deleteIndex);
                        originalOrder.remove(deleteIndex);
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
