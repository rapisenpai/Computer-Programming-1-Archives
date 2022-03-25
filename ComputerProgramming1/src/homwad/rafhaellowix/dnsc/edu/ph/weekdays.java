package homwad.rafhaellowix.dnsc.edu.ph;

import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String weekday, userInput;

        System.out.print("Enter a number from 1-7: ");
        num = Integer.parseInt(sc.nextLine());

        switch (num) {

            case 1: weekday = "Monday";
            break;

            case 2: weekday = "Tuesday";
            break;

            case 3: weekday = "Wednesday";
            break;

            case 4: weekday = "Thursday";
            break;

            case 5: weekday = "Friday";
            break;

            case 6: weekday = "Saturday";
            break;

            case 7: weekday = "Sunday";
            break;

            default: weekday = "Invalid Day";
            break;

        }
        System.out.println("\nInputted number: " + num);
        System.out.println("Output: " + weekday);
    }
}
