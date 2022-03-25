package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class PacificBank {
    public static void main(String[] args) {

        double interest = 0.05, checkingAccount = 0.06;
        double y = 20;

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter account type: ");
        String accountType = sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter amount to be deposit: ");
        String amount = sc.nextLine();

        double future = Math.pow((1 + interest / 100), (y * 12) );
        //double amountPerYear = amount * future;

        System.out.print("Name: " + name);
        System.out.print("Account Type: " + accountType);
        System.out.println();

    }
}
