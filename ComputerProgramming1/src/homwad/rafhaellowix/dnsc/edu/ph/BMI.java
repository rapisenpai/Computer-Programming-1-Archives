package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h, w, bmi;

        System.out.print("Enter your height in meters: ");
        h = Double.parseDouble(sc.nextLine());
        System.out.print("Enter your weight in kilograms: ");
        w = Double.parseDouble(sc.nextLine());

        //Compute BMI
        bmi = w / (h * h);

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
