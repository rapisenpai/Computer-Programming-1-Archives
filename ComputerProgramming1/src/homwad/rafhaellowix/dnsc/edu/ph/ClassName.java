package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class ClassName {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int firstInteger;
                int secondInteger;
                int check;
                int multiplicityOccurred = 0;
                int x = 0;
                int sum = 0;
                String runItAgain;

                do {
                        x++;
                        System.out.print("Enter first integer: ");
                        firstInteger = Integer.parseInt(s.nextLine());
                        System.out.print("Enter second integer: ");
                        secondInteger = Integer.parseInt(s.nextLine());

                        check = (firstInteger / secondInteger) * secondInteger - firstInteger;

                        if (check == 0) {
                                System.out.print(firstInteger + " is a multiple of " + secondInteger + "\n");
                                multiplicityOccurred++;

                        } else {
                                System.out.print(firstInteger + " is not a multiple of " + secondInteger + "\n");
                        }

                        System.out.print("Do you want to continue the program? (Y or N) : ");
                        runItAgain = s.nextLine();

                        if (runItAgain.equalsIgnoreCase("N")) {
                                break;
                        }

                } while (true);
                System.out.print("\nThe number of times the multiplicity has occurred: " + (sum += multiplicityOccurred) + "\n");
                System.out.print("The total number of times the program has run: " + x + "\n");

        }
}

