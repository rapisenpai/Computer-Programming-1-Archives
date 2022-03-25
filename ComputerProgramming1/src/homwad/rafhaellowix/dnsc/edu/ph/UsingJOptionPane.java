package homwad.rafhaellowix.dnsc.edu.ph;

import javax.swing.*;

public class UsingJOptionPane {
    public static void main(String[] args) {
        int num1, num2, sum1, sum2, sum3, sum4;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first integer:", "Input", JOptionPane.QUESTION_MESSAGE));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second integer:", "Input", JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, "First integer inputted is " + num1 + " and the second integer inputted is " + num2);

        sum1 = num1 + num2;
        sum2 = num1 / num2;
        sum3 = num1 * num2;
        sum4 = num1 - num2;

        JOptionPane.showMessageDialog(null, "The sum of the two integers is: "+ sum1);
        JOptionPane.showMessageDialog(null, "The division of the two integers is: "+ sum2);
        JOptionPane.showMessageDialog(null, "The multiplication of the two integers is: "+ sum3);
        JOptionPane.showMessageDialog(null, "The subtraction of the two integers is: "+ sum4);
    }
}
