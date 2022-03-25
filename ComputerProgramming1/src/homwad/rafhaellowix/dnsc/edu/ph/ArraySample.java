package homwad.rafhaellowix.dnsc.edu.ph;

public class ArraySample {
    public static void main(String[] args) {

        String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + "\n");
        }
        int ages[] = new int[100];
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + "\n");
        }
        final int ARRAY_SIZE = 1000;
        int ages1[] = new int[ARRAY_SIZE];
        {
            System.out.print(ages1 + "\n");
        }
        String cars2[] = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars2) {
            System.out.print(i + "\n");
        }
    }
}
