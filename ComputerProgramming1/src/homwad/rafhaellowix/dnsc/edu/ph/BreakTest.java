package homwad.rafhaellowix.dnsc.edu.ph;

public class BreakTest {
    public static void main(String[] args) {
        int sum = 0, number = 0;

        while (number < 20) {
            number++;
            sum+=number;

            if (sum>=100) {
                break;
            }
            System.out.println("The number is : " + number);
            System.out.println("The sum is : " + sum);

        }
    }
}
