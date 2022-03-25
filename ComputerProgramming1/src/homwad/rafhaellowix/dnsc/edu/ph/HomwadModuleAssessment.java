package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.*;

public class HomwadModuleAssessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerName, customerType;
        int rBillProcessingFee, rBasicServiceFee, rPremiumChannels, bBillProcessingFee, bBasicServiceFee, bPremiumChannels,
                channels, connections, additionalServiceFee, rTotal, bTotal, bTotal2, connections1;

        //For residential customers, the following rates apply:
        rPremiumChannels = 300;
        rBillProcessingFee = 180;
        rBasicServiceFee = 820;

        //For business customers, the following rates apply:
        bPremiumChannels = 2000;
        bBillProcessingFee = 600;
        bBasicServiceFee = 300; //300 PHP because the first 10 connections is equivalent to 3,000 PHP.
        additionalServiceFee = 200;

        //Ask the customers
        System.out.print("Enter your name: ");
        customerName = scanner.nextLine();
        System.out.print("Enter your customer type\n(NOTE: You can only enter either \"Residential Customer\" or \"Business Customer\"): ");
        customerType = scanner.nextLine();

        if (customerType.equals("Residential Customer")) {
            System.out.print("Enter the no. of channels: ");
            channels = Integer.parseInt(scanner.nextLine());

            //Total billing of the Residential Customers
            rTotal = (channels * rPremiumChannels) + (rBillProcessingFee + rBasicServiceFee);

            //Display
            System.out.println("\nBILL OF THE CUSTOMER\n");
            System.out.println("Name: " + customerName);
            System.out.println("Customer Type: " + customerType);
            System.out.println("No. of channels: " + channels);
            System.out.println("\nHello " + ", since you are a residential type of customer your billing amount is " + rTotal + " PhP.");

        } else if (customerType.equals("Business Customer")) {

            System.out.print("Enter the no. of connections" +
                    "\n(NOTE: You can enter the no. from 1 - 10, if you want to add additional connections please enter and add no. below): ");
            connections = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the additional no. of connections: ");
            connections1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the no. of channels: ");
            channels = Integer.parseInt(scanner.nextLine());

            //Total billing of the Residential Customers
            bTotal = (channels * bPremiumChannels) + bBillProcessingFee + (bBasicServiceFee * connections);
            bTotal2 = (channels * bPremiumChannels) + (bBasicServiceFee * connections) + (connections1 * additionalServiceFee) + bBillProcessingFee;

            //Display
            System.out.println("\nBILL OF THE CUSTOMER\n ");
            System.out.println("Name: " + customerName);
            System.out.println("Customer Type: " + customerType);
            System.out.println("No. of connections: " + (connections + connections1));
            System.out.println("No. of channels: " + channels);
            if (connections1 > 1 ) {
                System.out.println("\nHello " + ", since you are a business type of customer your billing amount is " + bTotal2 + " PhP.");
            } else {
                System.out.println("\nHello " + ", since you are a business type of customer your billing amount is " + bTotal + " PhP.");
            }
        }
    }
}

