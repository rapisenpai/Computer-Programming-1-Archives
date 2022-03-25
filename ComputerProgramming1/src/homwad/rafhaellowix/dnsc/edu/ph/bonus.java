package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bonus {
    public static void main(String[] args) throws IOException {
        BufferedReader userData = new BufferedReader(new InputStreamReader(System.in));
        double b = 0.55, total, bonusAmount, salary;
        int yearOfService;
        String name;

        //Ask the user
        System.out.print("Enter your name: ");
        name = userData.readLine();
        System.out.print("Enter your year of service: ");
        yearOfService = Integer.parseInt(userData.readLine());
        System.out.print("Enter your salary: ");
        salary = Double.parseDouble(userData.readLine());

        //Calculate
        if (yearOfService >= 15 ) {
            bonusAmount = (b * salary);
            total = bonusAmount + salary;

            //Display
            System.out.println("\nTotal salary: "+ total);
            System.out.println("Bonus amount: " + bonusAmount);

        }
        else {
            bonusAmount = 0.0;
            //Display
            System.out.println("\nTotal salary: "+ salary);
            System.out.println("Bonus amount: " + bonusAmount);
        }
    }
}
