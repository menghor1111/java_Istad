import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        print even
//        for(int i = 0; i < 10; i++){
//            if(i % 2 == 0){
//                System.out.println(i + " ");
//            }
//            System.out.println(i);
//        }
//        print odd
//        for(int i = 0; i < 10; i++){
//            if(i % 2 != 0){
//                System.out.println(i + " ");
//            }
//
//        }
//        print 0-9 number
//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
        //print sorry
//        for (int i = 0; i < 10; i++){
//            System.out.println("I'm sorry: ");
//        }
        //print n
//        System.out.print("Enter n :");
//        int n = scanner.nextInt();
//        int sum = 1;
//        for (int i = 1; i <= n; i++) {
//            sum *= i;
//        }
//        System.out.println(sum);


        int number =5;
        int summer = 0;
       //while loop
        while(number > 0){
            summer += number;
            number--;
        }
        System.out.print(number);

    }

    //

  int n = 1 ;
    while(n <= 5){
        System.out.println("Hello");
    }

}
