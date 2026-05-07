package OOPS;

public class methodOverriding {
    public void show() {
        System.out.println("In A show");

    }

    public void show1() {
        System.out.println("In B show");

    }
}

class B extends methodOverriding {

}

class A {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.show1();

    }
}
