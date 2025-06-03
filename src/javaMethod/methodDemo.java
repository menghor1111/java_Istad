package javaMethod;

import java.sql.SQLOutput;

public class methodDemo {
    public static void main(String[] args) {

        method method = new method();
        method.welcomeMessage();

        int [] arr ={3, 4, 5, 19};
        printArr(arr);

        int a , b;
         a = 5;
         b = 8;
        System.out.println(a + b);
    }
    static int sumNumbers(int...nums){
        int sum = 0;
        for(int num: nums){
            sum =+ sum;
        }
        return sum;
    }

    private static void printArr(int[] arr) {
        for (int  num: arr){
            System.out.println(num + " ");
        }

    }


}
