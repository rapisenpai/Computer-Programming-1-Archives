package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBreak {
    public static void main(String[] args) throws IOException {
        BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));
        int item = 0, n, sum = 0;

            do {

                try {
                    item++;
                    System.out.print("\nEnter a number in item " + item + " : " );
                    n = Integer.parseInt(inputData.readLine());
                    sum += n;

                    if (n == 0) {
                        break;
                    }
                } catch (NumberFormatException nfe) {
                    System.err.print("Entered value is not a number\n");
                }

            } while (true);
            System.out.print("\nThe sum is " + sum);
    }
}
