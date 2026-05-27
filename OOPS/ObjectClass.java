package OOPS;

public class ObjectClass {
    String brand;
    int price;

}

class Demo {
    public static void main(String[] args) {

        ObjectClass obj = new ObjectClass();
        obj.brand = "Mani";
        obj.price = 1;
        System.out.println(obj.toString());

    }
}