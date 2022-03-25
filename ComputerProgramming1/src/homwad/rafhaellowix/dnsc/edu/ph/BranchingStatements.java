package homwad.rafhaellowix.dnsc.edu.ph;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int numbers = 1 ; numbers <= 10 ; numbers++ ) {
            if (numbers == 4 || numbers == 5 || numbers == 6 || numbers == 7 ) {
                continue;
            } System.out.print(numbers + "\n");
        }
    }
}

