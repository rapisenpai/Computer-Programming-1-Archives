package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class BMI1 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        double h, w, bmi, kgPerPound, mPerInch, wInKilo, hInMeters;

        System.out.print("Enter your height in inches: ");
        h = Double.parseDouble(inputData.nextLine());
        System.out.print("Enter your weight in pounds: ");
        w = Double.parseDouble(inputData.nextLine());

        //Compute BMI
        kgPerPound = 0.45359237;
        mPerInch = 0.0254;
        wInKilo = w * kgPerPound;
        hInMeters = h * mPerInch;
        bmi = wInKilo / (hInMeters * hInMeters);

        //Display
        System.out.println("\nYour BMI score is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Your BMI indicates that you are Underweight.");
        } if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI indicates that you are Normal.");

        }if (bmi >= 25.0 && bmi <= 29.9)  {
            System.out.println("Your BMI indicates that you are Overweight.");
        } if (bmi >= 30.0)  {
            System.out.println("Your BMI indicates that you are Obese.");
        }
    }
}
