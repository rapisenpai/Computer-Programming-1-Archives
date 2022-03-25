package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class HernandoElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("These are the code for consumer type:" +
                "\n1. Residential for R\n2. Commercial for C\n3. Industrial for I\n");

        System.out.print("\nEnter type of consumer: ");
        String consumer = sc.next();

        if (consumer.equals("R")) {

            double rate = 1.50;
            double consumedKwH = 0;
            double perMonth = 500;

            do {
                System.out.print("Enter consumed kilowatt-hour in a month: ");
                consumedKwH = Double.parseDouble(sc.next());
                System.out.print("Enter S to stop the program: ");
                String stop = sc.next();
                if (stop.equals("S")) {
                    break;
                }
            } while (true); {
                double totalBill = (consumedKwH*24*30*rate);

                System.out.print("\nTotal amount for residential: " + (totalBill+ perMonth));

            }

        }
        else if (consumer.equals("C")) {

            double rate = 2.0;
            double consumedKwH = 0;
            double first1000KWH = 0;
            do {
                System.out.print("Enter consumed kilowatt-hour in a month: ");
                consumedKwH = Double.parseDouble(sc.next());

                if (consumedKwH >= 1000) {
                    first1000KWH = 900;
                }
                System.out.print("Enter S to stop the program: ");
                String stop = sc.next();
                if (stop.equals("S")) {
                    break;
                }
            } while (true); {
                double totalBill = (consumedKwH*24*30*rate);
                System.out.print("\nTotal amount for residential: " + (totalBill+first1000KWH));

            }

        }
        else if (consumer.equals("I")) {

            double rate = 3.0;
            double consumedKwH = 0;
            double first1000KWH = 0;
            do {
                System.out.print("Enter consumed kilowatt-hour in a month: ");
                consumedKwH = Double.parseDouble(sc.next());

                if (consumedKwH >= 1000) {
                    first1000KWH = 1000;
                }
                System.out.print("Enter S to stop the program: ");
                String stop = sc.next();
                if (stop.equals("S")) {
                    break;
                }
            } while (true); {
                double totalBill = (consumedKwH*24*30*rate);
                System.out.print("\nTotal amount for residential: " + (totalBill+first1000KWH));

            }

        }
    }
}
