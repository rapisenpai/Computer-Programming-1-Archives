package homwad.rafhaellowix.dnsc.edu.ph;
import javax.swing.*;

public class JOptionPane_UserInput {
    public static void main(String []args ) {
        int x, y, sum;
        String firstName, surname, fullName, middleInitial;
        firstName = JOptionPane.showInputDialog(null, "What is your first name?","Information of the Student", JOptionPane.QUESTION_MESSAGE);
        middleInitial = JOptionPane.showInputDialog(null, "What is your Middle Initial?", "Information of the Student",JOptionPane.QUESTION_MESSAGE);
        surname = JOptionPane.showInputDialog(null, "What is your surname?", "Information of the Student",JOptionPane.QUESTION_MESSAGE);
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first grade", "Compute your Grades" , JOptionPane.QUESTION_MESSAGE));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your second grade","Compute your Grades" , JOptionPane.QUESTION_MESSAGE));
        sum = (x + y) / 2 ;
        fullName =  firstName + " " + middleInitial + " " +surname;

        if (sum > 75) {
            JOptionPane.showMessageDialog(null, "The student passed in the subject.");
        }
        if (sum < 75) {
            JOptionPane.showMessageDialog(null, "The student failed in the subject.");
        }
        if (sum == 75) {
            JOptionPane.showMessageDialog(null, "The student passed in the subject.");
        }
        JOptionPane.showMessageDialog(null,"The average of " + fullName + " is " + sum + ".");


    }

}
