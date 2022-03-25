package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetroSalary {
    public static void main (String [] args ) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double prevAnnualSalary, salaryIncrease, salaryTotal, newAnnualSalary, newMonthlySalary, prevMonthlySalary, moneyOwed;
        salaryIncrease = 0.075;

        try {
            System.out.print("Previous Annual Salary: ");
            prevAnnualSalary = Double.parseDouble(dataIn.readLine());
            salaryTotal = prevAnnualSalary * salaryIncrease;
            newAnnualSalary = salaryTotal + prevAnnualSalary;
            newMonthlySalary = newAnnualSalary / 12;
            prevMonthlySalary = prevAnnualSalary / 12;
            moneyOwed = (prevMonthlySalary * salaryIncrease) * 3;
            System.out.println("Retroactive Pay Due: " + moneyOwed);
            System.out.println("New Annual Salary: " + newAnnualSalary);
            System.out.println("New Monthly Salary: " + newMonthlySalary);

        } catch (IOException error) {
            System.out.println(error);
        }
    }
}
