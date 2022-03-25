package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricBill {
    public static void main(String[] args) throws IOException {
        BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));

        //Ask the user
        System.out.print("Enter consumer name: ");
        String consumerName = inputData.readLine();

        //Codes
        String residential = "1. Residential Consumer (code -> R)";
        String commercial = "2. Commercial Consumer (code -> C)";
        String industrial = "3. Industrial Consumer (code -> I)";

        System.out.print("\nConsumer types are as follows:" + "\n" + residential + "\n" + commercial + "\n" + industrial + "\n");
        System.out.print("\nEnter Consumer type (code only): ");
        String inputCode = inputData.readLine();

        int i = 0;
        double wattsRating, dailyUsage, amountToPay = 0;
        String name;

        if (inputCode.equals("R")) {
            //Rates for Residential consumer
            double rate = 1.50;
            double additionalP500PerMonth = 500.00;
            System.out.println("You can enter \"S\" to stop the program when asking for item name.");

            do {
                //Ask the user
                i++;
                System.out.print("\nEnter name for item " + (i) + ": ");
                name = inputData.readLine();
                if (name.equals("S")) {
                    break;
                }
                System.out.print("Enter watts rating for item " + (i) + ": ");
                wattsRating = Double.parseDouble(inputData.readLine());
                System.out.print("Enter consumed hours for item " + (i) + ": ");
                dailyUsage = Double.parseDouble(inputData.readLine());

                //Calculate //Convert watts to KW
                double totalConsumption = (wattsRating/1000)  * dailyUsage * 30; //30 Days
                amountToPay = amountToPay + (rate * totalConsumption);

            }while (true);
            //Display
            System.out.println("\nHello " + consumerName + ", since you are residential consumer your billing amount is "
                    + (amountToPay + additionalP500PerMonth) + " PhP.");

        } else if (inputCode.equals("C")) {
            //Rates for Commercial consumer
            double rate = 2.00;
            double first_1000KWH = 0;
            double totalConsumption;
            double sum = 0;

            System.out.println("You can enter \"S\" to stop the program when asking for item name.");

            do {
                //Ask the user
                i++;
                System.out.print("\nEnter name for item " + (i) + ": ");
                name = inputData.readLine();
                if (name.equals("S")) {
                    break;
                }
                System.out.print("Enter watts rating for item " + (i) + ": ");
                wattsRating = Double.parseDouble(inputData.readLine());
                System.out.print("Enter consumed hours for item " + (i) + ": ");
                dailyUsage = Double.parseDouble(inputData.readLine());

                //Calculate
                totalConsumption = (wattsRating/1000) * dailyUsage * 30; //30 Days

                //900 Pesos for first KilowattHour
                if (totalConsumption >= 1000 ) {
                    first_1000KWH = 900;

                    /*Since our first 1000KwH is already 900 pesos, thus the remaining of the consumer's consumed will be multiplied
                    by rates but before that we just need to subtract the total consumer's consumed in order to get the remaining consumption */

                    totalConsumption = totalConsumption-1000;
                }

                sum += totalConsumption;

            }while (true);

            // Calculate for total amount
            amountToPay = amountToPay + (sum * rate);

            // Display
            System.out.println("\nHello " + consumerName + ", since you are commercial consumer your billing amount is "
                    + (amountToPay + first_1000KWH) + " PhP.");

            /* Note if our (totalConsumption >= 1000 ) is false, therefore the 900 Pesos will not add for total amount
            because our decision control structure was not executed. In that case, our variable first_1000KWH is automatically 0. */

        } else if (inputCode.equals("I")) {
            //Rates for Industrial consumer
            double rate = 3.00;
            double first_1000KWH = 0;
            double totalConsumption;
            double sum = 0;

            System.out.println("You can enter \"S\" to stop the program when asking for item name.");

            do {
                //Ask the user
                i++;
                System.out.print("\nEnter name for item " + (i) + ": ");
                name = inputData.readLine();
                if (name.equals("S")) {
                    break;
                }
                System.out.print("Enter watts rating for item " + (i) + ": ");
                wattsRating = Double.parseDouble(inputData.readLine());
                System.out.print("Enter consumed hours for item " + (i) + ": ");
                dailyUsage = Double.parseDouble(inputData.readLine());

                //Calculate
                totalConsumption = (wattsRating/1000) * dailyUsage * 30; //30 Days

                //900 Pesos for first KilowattHour
                if (totalConsumption >= 1000 ) {
                    first_1000KWH = 1000;

                    /*Since our first 1000KwH is already 1000 pesos, thus the remaining of the consumer's consumed will be multiplied
                    by rates but before that we just need to subtract the total consumer's consumed in order to get the remaining consumption */

                    totalConsumption = totalConsumption-1000;
                }

                sum += totalConsumption;

            }while (true);

            // Calculate for total amount
            amountToPay = amountToPay + (sum * rate);

            // Display
            System.out.println("\nHello " + consumerName + ", since you are industrial consumer your billing amount is "
                    + (amountToPay + first_1000KWH) + " PhP.");

            /* Note if our (totalConsumption >= 1000 ) is false, therefore the 1000 Pesos will not add for total amount
            because our decision control structure was not executed. In that case, our variable first_1000KWH is automatically 0. */

        } else if (!inputCode.equals("I" + "C" + "R")) {
            System.out.print("Invalid code, please try again.");
        }
    }
}
