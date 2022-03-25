import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String firstName, middleName, lastName, year, course, section;
        float midtermGrade, finalGrade;

        System.out.print("Enter your First name: ");
        firstName = br.readLine();
        System.out.print("Enter your Initial name: ");
        middleName = br.readLine();
        System.out.print("Enter your Last name: ");
        lastName = br.readLine();
        System.out.print("Enter your Year: ");
        year = br.readLine();
        System.out.print("Enter your Course: ");
        course = br.readLine();
        System.out.print("Enter your Section: ");
        section = br.readLine();
        System.out.print("Enter your Midterm Grade: ");
        midtermGrade = sc.nextFloat();
        System.out.print("Enter your Final Grade: ");
        finalGrade = sc.nextFloat();

        student s1 = new student(firstName, middleName, lastName, year, course, section, midtermGrade, finalGrade);
        s1.introduce();
        s1.evaluation();



        /**

        //Character
        character c = new character("David", "Hello There", "Chares", "M", 5, 40, 65);
        character c1 = new character("Ersit", "Myghad kalisud", "Chares", "M", 5, 40, 65);
        //This is call method from another class
        c.introduce();
        c1.introduce();
        c1.sayDialog();
        c.sayDialog();
        c.talkTo(c1);

        myStaticMethod(); // Call the static method
        main myObj = new main(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method



        //Person
        System.out.print("Enter your first name: ");
        String firstName = br.readLine();
        System.out.print("Enter your middle initial: ");
        char middleInitial = br.readLine().charAt(0);
        System.out.print("Enter your lastname: ");
        String lastName = br.readLine();
        System.out.print("Enter your sex: ");
        char sex = br.readLine().charAt(0);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);

        /** Always Remember don't use BufferedReader when it comes for integer. //

        person p1 = new person(firstName, middleInitial, lastName, sex, age);

        // Average Grade Example Code
        System.out.print("Enter your average score in Mathematics: ");
        int math = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your average score in English: ");
        int english = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your average score in Science: ");
        int science = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your average score in Filipino: ");
        int filipino = Integer.parseInt(sc.nextLine());

        averageGrade avg1 = new averageGrade(math, english, filipino, science);
         **/


    }
}
