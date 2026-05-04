class Mobile {
    String brand;
    int prize;
    static String name;

    public void show() {
        System.out.println(brand + " : " + prize + " : " + name);
    }
}

public class StaticVar {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.prize = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.prize = 15000;
        Mobile.name = "SmartPhone";

        Mobile.name = "TouchPads";

        obj1.show();
        obj2.show();
    }
}

// Static variables are actually shared by different objects and if we want
// to refer them we have to use class name