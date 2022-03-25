package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Age");
        int age = sc.nextInt();
        System.out.print("Enter Allowance: ");
        int allowance = sc.nextInt();

        if (age <= 18 ) {
            System.out.print("Denied");
            System.out.print("No children");

        }
        if (age >= 18 || allowance >= 20000) {
            System.out.print("Approved");
            System.out.print("1 children");
        }


    }
}
