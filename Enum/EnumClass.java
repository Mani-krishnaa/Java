package Enum;

enum Laptop {
    MacBook(2000), XPS(2200), Surface, ThinkPad(1800); // Here MAcbook,XPS,Surfce, is Constant and we are directly
                                                       // passing values,
                                                       // A constant is a value that does not
                                                       // change during program execution.

    /*
     * For Instance
     * public static final Laptop MacBook = new Laptop(2000);
     * public static final Laptop XPS = new Laptop(2200);
     *
     */

    private int price;

    private Laptop() { // defualt constuructor
        price = 500;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class EnumClass {

    public static void main(String[] args) {
        Laptop l = Laptop.XPS;
        System.out.println(l.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
            lap.setPrice(12);
            System.out.println(lap + " : " + lap.getPrice());

        }

    }
}