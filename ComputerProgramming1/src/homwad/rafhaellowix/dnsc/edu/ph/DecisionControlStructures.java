package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class DecisionControlStructures {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int x;

       System.out.println("Enter the double number: ");
       x = sc.nextInt();
        if (x == 10){
            System.out.println("Value of X is 10");
        } else if (x == 20) {
            System.out.println("Value of X is 20");
        } else if (x == 30) { if (x == 40) { System.out.println("Value of X is 40");
        } else
            System.out.println("Value of X is 30");
        } else System.out.println("Value of X is " + x);
    }
}
