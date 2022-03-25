package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, department;
        double hoursWork, hourlyRate, totalEarned, weeklyEarning;

        System.out.print("Input employee name: ");
        name = sc.nextLine();
        System.out.print("Input department name: ");
        department = sc.nextLine();
        System.out.print("Input hours worked for the week: ");
        hoursWork = sc.nextInt();
        System.out.print("Input hourly rate: ");
        hourlyRate = sc.nextInt();

        totalEarned = hoursWork * hourlyRate;
        weeklyEarning = 0.15 * totalEarned; //15% of its weekly earning on his/her gross pay.

        System.out.println("\nMr. " + name + " from " + department + " department earned " + (totalEarned + weeklyEarning) +" pesos this week." );

    }
}
