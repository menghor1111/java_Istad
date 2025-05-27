public class array {
    public static int search(int[] arr, int key) {
        int fibM2 = 0, fibM1 = 1, fibM = fibM1 + fibM2;
        int size = arr.length, offset = -1;
        while (fibM < size) {
            fibM2 = fibM1;
            fibM1 = fibM;
            fibM = fibM1 + fibM2;
        }
        while (fibM > 1) {
            int i = Math.min(offset + fibM2, size - 1);
            if (arr[i] < key) {
                fibM = fibM1;
                fibM1 = fibM2;
                fibM2 = fibM - fibM1;
                offset = i;
            } else if (arr[i] > key) {
                fibM = fibM2;
                fibM1 -= fibM2;
                fibM2 = fibM - fibM1;
            } else return i;
        }
        return (fibM1 == 1 && arr[offset + 1] == key) ? offset + 1 : -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println(search(arr, key) != -1 ? "Element found" : "Element not found.");
    }
}