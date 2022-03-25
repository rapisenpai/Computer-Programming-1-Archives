public class student {


    String firstName, lastName, middleName, year, course, section;
    float midtermGrade, finalGrade;

    Float avg, calculation;
    String remarks;

    student(String firstName, String middleName, String lastName, String year, String course, String section, float midtermGrade, float finalGrade){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;

    }

    void introduce() {
        System.out.println("\nStudent Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Course, Year & Set: " + course + " " + year + "-" + section );

    }
    void evaluation() {
        calculation = (midtermGrade + finalGrade) / 2;
        avg = calculation;

        if (avg > 100) remarks = "Invalid Grade";
        else if (avg >= 98) remarks = "With Highest Honors";
        else if (avg >= 95) remarks = "With High Honors";
        else if (avg >= 90) remarks = "With Honors";
        else if (avg >= 75) remarks = "Passed";
        else remarks = "Failed";

        System.out.println("\nGWA: " + avg);
        System.out.println("Remarks: " + remarks);
    }
}
