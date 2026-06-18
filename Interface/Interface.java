package Interface;

interface Act {
    public static final int age = 1;
    String S = "Mani"; // here all variables are final and static,and no need declare as well

    void show();

    void config(); // these both method are by defualt public abstract

}

interface Acts {
    void run();
}

interface Actss extends Act {

}

public class Interface implements Act, Acts { // We can do multiple interface as well

    public void show() {
        System.out.println("In show");

    }

    public void config() {
        System.out.println("In  config");

    }

    public void run() {
        System.out.println("In running");
    }

}

class Bct {
    public static void main(String[] args) {

        Interface i = new Interface();
        i.show();
        i.config();
        i.run();
        System.out.println(Act.age); // Here age is Static Variable, So we can directly access static variables
                                     // without creating
                                     // Objects

    }
}

/*
 * An Interface is a contract.
 *
 * It tells a class:
 *
 * "If you implement me, you MUST provide these methods."
 *
 * class -> class, extends
 * class -> interface, implements
 * interface -? interface, extends
 *
 *
 *
 *
 */