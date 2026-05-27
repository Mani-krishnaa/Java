package OOPS;

final class Calc { // final class
    public void show() {
        System.out.println("In cal show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);

    }
}

// class Advcal extends Calc {

// }

public class FInalkeyword {
    public static void main(String[] args) {
        final int num = 8; // final varibale
        // num = 9;
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);
    }

}
