class Demo {
    String name;
    int prize;
    static String brand;

    public void show() {
        System.out.println(name + " " + prize + " " + brand);
    }

    public static void show1(Demo dem) {
        System.out.println("Staticmethod " + dem.name + " " + dem.prize + " " + brand);
    }
}

class staticMethod {
    public static void main(String[] args) {

        Demo dem = new Demo();
        dem.name = "Mani";
        dem.prize = 12;
        Demo.brand = "Sasta";

        Demo dem1 = new Demo();
        dem1.name = "ManiCH";
        dem1.prize = 121;
        Demo.brand = "Sasta";
        dem.show();
        dem1.show();
        Demo.show1(dem);

    }
}
