public class averageGrade {

    int math, english, filipino, science, calculation, GWA, passing = 75;

    averageGrade(int math, int english, int filipino, int science){
        this.math = math;
        this.english = english;
        this.filipino = filipino;
        this.science = science;

        //Calculation and Display Output
        calculation = (math + english + science + filipino) / 4;
        GWA = calculation;

        System.out.println("General Weighted Average: " + GWA);
        if (GWA >= passing) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    }



}
