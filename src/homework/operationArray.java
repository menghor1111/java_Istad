package homework;

import java.util.Arrays;
import java.util.Scanner;

public class operationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter array length
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        // Enter array elements
        System.out.println("Enter " + length + " elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        while (true) {
            // Display menu
            System.out.println("\nOptions:");
            System.out.println("1. Show array");
            System.out.println("2. Sort array");
            System.out.println("3. Reverse sorted array");
            System.out.println("4. Reverse unsorted array");
            System.out.println("5. Insert an element");
            System.out.println("6. Update an element");
            System.out.println("7. Delete an element");
            System.out.println("0. Exit program");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Array: " + Arrays.toString(array));
                    break;
                case 2:
                    Arrays.sort(array);
                    System.out.println("Sorted array: " + Arrays.toString(array));
                    break;
                case 3:
                    Arrays.sort(array);
                    reverseArray(array);
                    System.out.println("Reverse sorted array: " + Arrays.toString(array));
                    break;
                case 4:
                    reverseArray(array);
                    System.out.println("Reverse unsorted array: " + Arrays.toString(array));
                    break;
                case 5:
                    System.out.print("Enter element to insert: ");
                    int newElement = scanner.nextInt();
                    System.out.print("Enter position (0 to " + length + "): ");
                    int pos = scanner.nextInt();
                    array = insertElement(array, newElement, pos);
                    length++;
                    System.out.println("Updated array: " + Arrays.toString(array));
                    break;
                case 6:
                    System.out.print("Enter position to update (0 to " + (length - 1) + "): ");
                    int updatePos = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = scanner.nextInt();
                    if (updatePos >= 0 && updatePos < length) {
                        array[updatePos] = newValue;
                        System.out.println("Updated array: " + Arrays.toString(array));
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 7:
                    System.out.print("Enter position to delete (0 to " + (length - 1) + "): ");
                    int deletePos = scanner.nextInt();
                    array = deleteElement(array, deletePos);
                    length--;
                    System.out.println("Updated array: " + Arrays.toString(array));
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] insertElement(int[] array, int element, int pos) {
        if (pos < 0 || pos > array.length) {
            System.out.println("Invalid position.");
            return array;
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == pos) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }

    public static int[] deleteElement(int[] array, int pos) {
        if (pos < 0 || pos >= array.length) {
            System.out.println("Invalid position.");
            return array;
        }
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != pos) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
}