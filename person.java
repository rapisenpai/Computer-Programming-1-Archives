public class person {

    //This is class instantiation.

    String firstName, lastName;
    char middleInitial, sex;
    int age;

    // This is Constructors
    person(String firstName, char middleInitial, String lastName, char sex, int age){

        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;


        //Display

        System.out.println("Name: " + firstName + " " + middleInitial + ". " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);

    }


}
