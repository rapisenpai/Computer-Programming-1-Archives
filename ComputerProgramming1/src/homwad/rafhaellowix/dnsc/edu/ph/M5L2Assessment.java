package homwad.rafhaellowix.dnsc.edu.ph;

public class M5L2Assessment {
    public static void main(String[] args) {
        double [] myList = {1.9, 2.9, 3.4, 3.5};
        double sum = 0;
        double max = myList[0];

        System.out.println("All Array elements");
        for (int i = 0; i <= 3; i++) {
            sum += myList[i];

            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(myList[i]);
        }
        System.out.print("\n\nThe sum of all element : " + sum);

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.print("\n\nThe Largest element: " + max);
    }
}
