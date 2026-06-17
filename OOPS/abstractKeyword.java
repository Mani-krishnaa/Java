package OOPS;

abstract class Car { // abstarct class

    abstract public void drive();

    public void playMusic() {
        System.out.println("Play music");

    }
}

class Driving extends Car {// Concrete class
    public void drive() {
        System.out.println("Driving has been intailized");
    }
}

public class abstractKeyword {
    public static void main(String[] args) {

        Car d = new Driving(); // we cannot create a object for abstract class
        d.playMusic();
        d.drive();

    }

}

/*
 * An abstract class is a class that cannot be instantiated (cannot create
 * objects directly).
 * Can an abstract class have constructors?
 * 
 * ✅ Yes
 * 
 * Can an abstract class have normal methods?
 * 
 * ✅ Yes
 * 
 * Can an abstract class have abstract methods?
 * 
 * ✅ Yes
 * 
 * Can we create an object of an abstract class?
 * 
 * ❌ No
 * 
 * If a class extends an abstract class, must it implement all abstract methods?
 * 
 * ✅ Yes, unless the child class is also abstract.
 */
