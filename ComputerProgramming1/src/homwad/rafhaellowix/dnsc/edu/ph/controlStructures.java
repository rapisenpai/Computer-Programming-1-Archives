package homwad.rafhaellowix.dnsc.edu.ph;

public class controlStructures {
    public static void main (String [] args ) {
        int x = 3, w, h, lbs, inc, myAge;
        boolean item1, item2, item3, item4, item5, item6, item7, item8 ;

        w = 63;
        h = 197;
        lbs = 50;
        inc = 60;


        item1 = (false) && (3>4);
        item2 = !( x > 0) && (x < 0);
        item3 = (x != 0) || (x == 0);
        item4 = (x != 1) == !(x == 1);
        System.out.println("answer 1: " + item1);
        System.out.println("answer 2: " + item2);
        System.out.println("answer 3: " + item3);
        System.out.println("answer 4: " + item4);

        item8 = (w > lbs) == (h > inc);
        System.out.println("answer 8: " + item8);

        myAge = 20;

        item6 = (myAge > 13) || (myAge < 18);
        System.out.println("answer 6: " + item6);



    }
}
