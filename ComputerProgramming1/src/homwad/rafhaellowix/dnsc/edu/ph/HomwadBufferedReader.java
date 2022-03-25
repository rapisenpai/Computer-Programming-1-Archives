package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.*;
import java.io.InputStreamReader;

public class HomwadBufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input your name: ");
        String name = br.readLine();
        System.out.print("Input your Age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Input your Average: ");
        double avg = Double.parseDouble(br.readLine());
        System.out.print("Input your address: ");
        String adress = br.readLine();

        System.out.println("\nHi! I am " + name + ", " + age + " years old.");
        System.out.println("I am living at " + adress + " with an average grade of " + avg);
    }
}
