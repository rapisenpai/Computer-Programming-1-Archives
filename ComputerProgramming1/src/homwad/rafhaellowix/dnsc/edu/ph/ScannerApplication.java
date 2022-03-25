package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;
//A. Create a class name ScannerApplication
public class ScannerApplication {
    public static void main(String []args ) {
        Scanner sc = new Scanner(System.in);

        //B. Declare the following variables with the corresponding data types and initialization values.
        int number ;
        double net_pay;
        char letter;
        boolean result;
        String message;

        //C. Output to the screen the variable names above together with its corresponding values.
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        System.out.println("number value given is " + number);

        System.out.print("\nEnter your NetPay: ");
        net_pay = sc.nextInt();
        System.out.println("net_pay value given is " + net_pay);

        System.out.print("\nEnter a letter: ");
        letter = sc.next().charAt(0);
        System.out.println("letter value given is: " + letter);

        System.out.print("\nEnter some boolean value: ");
        result = sc.nextBoolean();
        System.out.println("result value given is " + result);

        System.out.print("\nEnter a message: ");
        message = sc.next();
        System.out.println("message value given is " + message + "\n");

        //D. Declare another variables namely num1, num2, and num3 for the 3 quizzes.
        double num1, num2, num3;

        //E. Store numbers with decimal point values to variables num1, num2, and num3, respectively.
        num1 = 9.5;
        num2 = 10.0;
        num3 = 8.5;

        //F. Store the sum of the quizzes to variable total and the average of the quizzes to variable ave.
        double total, ave;
        total = (num1 + num2 + num3);
        ave = total / 3;

        //G. Output to the Screen the variable names of the quizzes and its corresponding values.
        System.out.println("num1 value given is " + num1);
        System.out.println("num2 value given is " + num2);
        System.out.println("num3 value given is " + num3);

        //H. Output to the screen the variable name which holds the sum of the quizzes as well as its value.
        System.out.println("total value given is " + total);

        //I. Output to the screen the variable name which holds the average of the quizzes as well as its value.
        System.out.println("ave value given is " + ave);

        //J. Use appropriate data types and organize the structure of your program. (DONE)
        /*K. Use escape character in printing the required to be output. (DONE)
          L. In coding your program use java comments: 1 single-line and 1 multi-line. (DONE) */

    }
}
