package homwad.rafhaellowix.dnsc.edu.ph;

import javax.swing.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        String name, department;
        double totalHoursWorked, hourlyRate, philHealth, sss, pagIbig, netPay, deductions, grossPay;

        //Deductions
        philHealth = 400;
        sss = 1500;
        pagIbig = 300;

        //The total of all deductions
        deductions = philHealth + sss + pagIbig;

        name = JOptionPane.showInputDialog(null, "What is your name?",
                "Information of the Employee", JOptionPane.QUESTION_MESSAGE);
        department = JOptionPane.showInputDialog(null, "What department are you from?",
                "Information of the Employee", JOptionPane.QUESTION_MESSAGE);
        totalHoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the total hours worked for 15 days:",
                "Information of the Employee", JOptionPane.QUESTION_MESSAGE));
        hourlyRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the hourly rate from your company:",
                "Information of the Employee", JOptionPane.QUESTION_MESSAGE));

        grossPay = totalHoursWorked * hourlyRate;
        netPay = grossPay - deductions;

        JOptionPane.showMessageDialog(null, "Name: " + name);
        JOptionPane.showMessageDialog(null, "Department: " + department);
        JOptionPane.showMessageDialog(null, "Total Hours Worked: " + totalHoursWorked + " hours");
        JOptionPane.showMessageDialog(null, "Hourly Rate: " + hourlyRate + " Php");
        JOptionPane.showMessageDialog(null, "NetPay: " + netPay + " Php");
        JOptionPane.showMessageDialog(null, "Total deductions is: " + deductions + " Php");
        JOptionPane.showMessageDialog(null, "GrossPay: " + grossPay + " Php");
    }

}
