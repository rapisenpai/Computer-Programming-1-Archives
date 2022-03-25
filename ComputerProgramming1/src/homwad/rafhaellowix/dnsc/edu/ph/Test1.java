package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class Test1 {
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);

        int x = 0;

        System.out.println("Input value for x :");
        x = sc.nextInt();
        String res = (x>6)? "High" : "Low";
        System.out.print(res);
        int num1 = (5<((3>5)? 5:3))? 5:3;
        System.out.print(num1);
    }
}
