package rapisenpai;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        addition(10, 20);
        multiply(9, 9);
        division(0, 0);
        quiz(0, 0, 0);
    }

    private static void quiz(double a, double b, double c) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter a score for quiz 1: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter a score for quiz 2: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.print("Enter a score for quiz 3: ");
        c = Double.parseDouble(sc.nextLine());
        int avg = (int) ((a+b+c)/3);

        System.out.println("AVG Score: " + avg);


    }

    private static void division(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter a number for variable a: ");
        a = sc.nextInt();
        System.out.print("Enter a number for variable b: ");
        b = sc.nextInt();
        System.out.print("\nDivision = " + (a/b));
    }

    private static void addition(int a, int b) {
        System.out.print("Addition = " + (a + b));
    }
    private static void multiply(int a, int b) {
        System.out.print("\nMultiply = " + a * b);
    }
}