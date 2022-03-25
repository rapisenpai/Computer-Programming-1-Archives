package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DairyMilk {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double cost, profit, cartons, liters, milkProduce, cartonHolds, profitEachCartoon;

        cost = 16.75;
        cartonHolds = 3.75;
        profitEachCartoon = 11.90;

        try {
            System.out.print("Enter the liters of milk: ");
            liters = Double.parseDouble(dataIn.readLine());

            cartons = liters / cartonHolds;
            milkProduce = liters * cost;
            profit = profitEachCartoon * cartons;


            System.out.println("\nThe number cartons produced: " + cartons);
            System.out.println("The cost of producing milk: " + milkProduce);
            System.out.println("The profit of producing milk: " + profit);

        } catch (IOException error) {
            System.out.println("Error");
        }
    }
}
