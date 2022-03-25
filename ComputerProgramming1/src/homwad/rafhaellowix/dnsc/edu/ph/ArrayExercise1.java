package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {

        double sum = 0;
        Scanner sc = new Scanner(System.in);
        int grades[] = new int[20];
        int max = grades[0];
        int min = grades[0];

        System.out.print("Enter final grade for student no. 1: ");
        int student1 = Integer.parseInt(sc.nextLine());
        grades[0] = student1;

        System.out.print("Enter final grade for student no. 1: ");
        int student2 = Integer.parseInt(sc.nextLine());
        grades[1] = student2;

        int passing = 0;


        for (int i = 0; i < grades.length; i++) {

            if (grades[i] > max) {
                max = grades[i];
            }
            if(grades[i] <min)
                min = grades[i];

            //Print
            System.out.println(grades[i]);

            if (grades[i] <= 76 || grades[i] <= 80) {
                passing++;

            }
        }


        System.out.print("\nHighest Grade: " + max);
        System.out.print("\nLowest Grade: " + min);
        System.out.println("\nGrade 76-80: " + passing + " Student/s" );

    }
}
