public class character {

    //These are the attributes or also known as fields

    String name, dialog, asd, gender;
    int hp, mp, lvl;

    //This is the constructor
    //Note: There is no shortcut when declaring constructor
    //Note: Constructor names must the same as class name
    character(String name, String dialog, String asd,String gender, int hp, int mp, int lvl) {

        this.name = name;
        this.dialog = dialog;
        this.asd = asd;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;

        //then instantiate the object to the main class
    }
    // this is object method
    void introduce() {
        System.out.println("I am " + name);
        // then call this object method to the main class

    }
    void sayDialog() {
        System.out.println(name + ": " + dialog);
    }
    //Also, we can create an object method using the class name, ie:
    void talkTo(character x) {
        System.out.println(name + ": Hello, " + x.name);
        // then call this object method to the main class
    }


}
