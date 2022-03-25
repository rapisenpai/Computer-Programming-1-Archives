package homwad.rafhaellowix.dnsc.edu.ph;

public class SampleProblemM4L3_2 {
    public static void main(String[] args) {
        int sum=0,number=0;

        while (number < 20) {
            number++;
            System.out.print(number);
            sum+=number;

            if(sum>=100)
                break;
        }
        System.out.print("\n The last number generated is: "+ number);
        System.out.print("\n The sum of those numbers is: "+ sum);
    }
}
