package homwad.rafhaellowix.dnsc.edu.ph;

public class Practice2 {
    public static void main(String[] args) {

        //How to sum array

        double [] myList = {1.9, 2.9, 3.4, 3.5};
        double sum = 0;


        for (int i = 0; i <= 3; i++) {
            sum += myList[i];
        }
        System.out.print("Sum: " + sum + "\n");


        //How to print numbers with comma

        for (int i = 0; i <= 3; i++) {

            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(myList[i]);

        }
        //Determine the largest number in array
        double max = myList[0];
        for (int i = 0; i <= 3; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.print("\nThe Largest element: " + max);

    }
}
