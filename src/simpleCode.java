import java.util.Scanner;

public class simpleCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * input value : 3
         * input value: 4
         * input operator (+, -, *, /
         * result = 7
         * */
        int number1, number2 ;
        int result ;
        System.out.print("Enter Number 1:");
        number1 = scanner.nextInt();
        System.out.print("Enter Number 2:");
        number2 = scanner.nextInt();
        result = number1 + number2;
        System.out.println(result);
        result = number1 - number2;
        System.out.println(result);
        result = number1 * number2;
        System.out.println(result);
        result = number1 / number2;
        System.out.println(result);
        switch (result) {
            case 1 :
                System.out.println(result );
                result = number1 + number2;
                break;
            case 2 :
                result = number1 - number2;
                System.out.println(result);

                break;
            case 3 :

                 System.out.println(result);
                result = number1 * number2;
                break;
            case 4 :

                System.out.println(result);
                result = number1 / number2;
                break;
                default :
        }

    }

}
