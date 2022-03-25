package homwad.rafhaellowix.dnsc.edu.ph;

public class HomwadModuleAssessmentM5L2 {
    public static void main(String[] args) {
        double sum1 = 0, sum2 = 0;
        double[][] scores = {
                /* index 0 */ {60, 55, 70},
                /* index 1 */ {80, 60, 41}
        };
        for (int i = 0; i < 3; i++) {
            sum1 += scores[0][i];
        }
        for (int j = 0; j < 3 ; j++) {
            sum2 += scores[1][j];
        }
        System.out.println("\n\nAverage score of 1st student : " + sum1/3);
        System.out.println("Average score of 2nd student : " + sum2/3 + "\n\n");
    }
}

