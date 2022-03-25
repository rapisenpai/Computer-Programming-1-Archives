package homwad.rafhaellowix.dnsc.edu.ph;

import javax.swing.*;

public class SalesMan {
    public static void main(String[] args) {
        double a, b, c, salesman, commission, qtyItemA,qtyItemB, qtyItemC, totalSoldItem, netEarnings, totalA, totalB, totalC;
        String name;

        //Item Price
        a = 123.56;
        b = 321.45;
        c = 100.34;
        salesman = 500;
        commission = 0.15 ;

        //Information of the salesman
        name = JOptionPane.showInputDialog(null, "Name of the Salesman: ", "Information of the Salesman",
                JOptionPane.QUESTION_MESSAGE);
        qtyItemA = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Qty. Sold of the Item A:"));
        qtyItemB = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Qty. Sold of the Item B:"));
        qtyItemC = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Qty. Sold of the Item C:"));

        //Solving the sales
        totalA = a * qtyItemA;
        totalB = b * qtyItemB;
        totalC = c * qtyItemC;

        JOptionPane.showMessageDialog(null, "The total of every sold item by " + name
                + "\n A = " + totalA
                + "\n B = " + totalB
                + "\n C = " + totalC);

        totalSoldItem = totalA + totalB + totalC;
        netEarnings = (totalSoldItem * commission) + salesman;

        JOptionPane.showMessageDialog(null, "The total sales of " + name + " is " + totalSoldItem);
        JOptionPane.showMessageDialog(null, "The net earnings of " + name + " is " + netEarnings);
    }
}
