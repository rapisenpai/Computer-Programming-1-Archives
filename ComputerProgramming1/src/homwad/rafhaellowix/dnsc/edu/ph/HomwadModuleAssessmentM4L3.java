package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomwadModuleAssessmentM4L3 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber, secondNumber, check, multiplicity = 0, sum1 = 0, sum2 = 0;
        String runItAgain;

        do {
            try {
                //Asking the user
                sum1++;
                System.out.print("\nEnter first number: ");
                firstNumber = Integer.parseInt(inputData.readLine());
                System.out.print("Enter second number: ");
                secondNumber = Integer.parseInt(inputData.readLine());

                //Check if the first number is a multiple of second number.
                check = (firstNumber / secondNumber) * secondNumber - firstNumber;

                if (check == 0) {
                    System.out.print(firstNumber + " is a multiple of " + secondNumber + "\n");
                    //Times of multiplicity
                    multiplicity++;

                } else {
                    System.out.print(firstNumber + " is not a multiple of " + secondNumber + "\n");
                }

                //Ask the user whether they want to run again or not.
                System.out.print("Press C to continue or Press S to stop the program: ");
                runItAgain = inputData.readLine();

                if (runItAgain.equalsIgnoreCase("S")) {
                    break;
                }

            }
            //Error Message
            catch (NumberFormatException nfe ) {
                System.err.print("Entered value is not a number\n");
            }

        } while (true);
        //Times of the multiplicity
        System.out.print("\nThe number of times the multiplicity has occurred: " + (sum2 += multiplicity) + "\n");

        //Times of the program runs
        System.out.print("The total number of times the program has run: " + sum1 + "\n");

    }
}



