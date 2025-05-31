package array;

public class testing {
    public static void main(String[] args) {

        int []  arr = new int [2000];
        int size = arr.length;
        int i = 0;
        while(size > 0){
            arr [i] = ++i;
            --size;
        }

        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
        int luckyNumber = 168;
        int indexFound = -1;

        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (high + low)/2;
            if(arr[mid] == luckyNumber){
                indexFound = mid;
                break;

            }else if(arr[mid] < luckyNumber){
                low = mid + 1;

            }else{
                high = mid -1;
            }
        }
        System.out.printf("Element [%d] is at index{%d]",indexFound);
    }
}
