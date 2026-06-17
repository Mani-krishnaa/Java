package OOPS;

abstract class Abst {
    public abstract void show();

    public abstract void show1();

}

public class AbstarctAnonymousclass {
    public static void main(String[] args) {

        Abst a = new Abst() {
            public void show() {
                System.out.println("Anonymosu class show");
            }

            public void show1() {
                System.out.println("Anonymosu class show1");

            }

        };
        a.show();
        a.show1();

    }
}

