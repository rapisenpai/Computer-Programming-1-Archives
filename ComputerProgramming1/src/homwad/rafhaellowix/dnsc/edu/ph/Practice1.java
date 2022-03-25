package homwad.rafhaellowix.dnsc.edu.ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
    public static void main(String[] args) throws IOException {

        //How to sum in Do While Loop

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            try{
                int i = 0, sum = 0, grades, subjects, avg;
                System.out.print("\nHow many subjects do you have? ");
                subjects = Integer.parseInt(br.readLine());
                do {
                    i++;
                    System.out.print("Enter your grade in subject " + i + " : ");
                    grades = Integer.parseInt(br.readLine());

                    sum += grades; //You must sum first before terminating the program.

                    if (i == subjects) {
                        break;
                    }

                }while (true); {
                    avg = sum / subjects;

                    if (avg <= 71) {
                        System.out.println("Total average: " + avg + " or 5.0");
                        System.out.print("Failure.\nIt requires a re-enrollment of the course.");
                    }
                    else if (avg <= 74 || avg <= 72) {
                        System.out.println("Total average: " + avg + " or 4.0");
                        System.out.print("""
                            Conditional\n(must be removed through a removal exam (prior to submission of
                            final grades). If a student passes, the final grade shall not be better than 3.0.
                            If he fails, the final grade shall be 5.0.""");
                    }
                    else if (avg <= 75 || avg <= 76) {
                        System.out.println("Total average: " + avg + " or 3.0 ");
                        System.out.print("Passing");

                    }
                    else if (avg <= 77 || avg <= 79) {
                        System.out.println("Total average: " + avg + " or  2.75");
                        System.out.print("Fair");

                    }
                    else if (avg <= 80 || avg <= 82) {
                        System.out.println("Total average: " + avg + " or 2.5");
                        System.out.print("Moderately Fair");

                    }
                    else if (avg <= 83 || avg <= 85) {
                        System.out.println("Total average: " + avg + " or 2.25");
                        System.out.print("Satisfactory");

                    }
                    else if (avg <= 86 || avg <= 88) {
                        System.out.println("Total average: " + avg + " or 2.0 ");
                        System.out.print("Very Satisfactory");

                    }
                    else if (avg <= 89 || avg <=91) {
                        System.out.println("Total average: " + avg + " or 1.75");
                        System.out.print("Good");
                    }
                    else if (avg <= 92 || avg <= 94) {
                        System.out.println("Total average: " + avg + " or 1.5");
                        System.out.print("Very Good");

                    }
                    else if (avg <= 95 || avg <= 97) {
                        System.out.println("Total average: " + avg + " or 1.25 ");
                        System.out.print("Outstanding");

                    }
                    else if (avg <= 98 || avg <= 100) {
                        System.out.println("Total average: " + avg + " or 1.0");
                        System.out.print("Excellent");

                    }else {
                        System.out.print("INC (Incomplete)\n" +
                                "This is given if a student whose class standing throughout the semester or term\n" +
                                "is passing but he/she fails to take the final examination or student fails to\n" +
                                "complete all the academic requirements for the course due to illness or other\n" +
                                "valid reasons. The deficiency will be indicated by “INC” which must be removed\n" +
                                "within a period of one year by passing the examination or meeting all the\n" +
                                "requirements for the course except for graduating students in a given semester.\n" +
                                "After which the student shall be given a final grade based on his overall\n" +
                                "performance. Accomplished completion form signed by the subject Instructor\n" +
                                "must be submitted within the specified period for such removal. If the student\n" +
                                "fails to do so, he shall automatically get a grade of 5.");
                    }
                }
                System.out.print("\nDo you want to run it again? ");
                String ans = br.readLine();
                if (ans.equalsIgnoreCase("No")) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.err.print("Entered value is invalid\n");
            }
        } while (true);
    }
}
