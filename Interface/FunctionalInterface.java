package Interface;

@FunctionalInterface // Exactly one abstract method
interface A {
    void show();
}

// class B implements A {

// @Override
// public void show() {
// System.out.println("d");
// }

// }

class Functionalinterface {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Show");
            }

        };
        obj.show();

    }

}