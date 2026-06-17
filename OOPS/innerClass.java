package OOPS;

class Aa {

    int age;

    public void show() {
        System.out.println("In Aa");
    }

    class Bb {

        public void show1() {
            System.out.println("In Bb");
        }

    }

}

class innerClass {
    public static void main(String[] args) {
        Aa a = new Aa();
        a.show();

        Aa.Bb c = a.new Bb(); //if i want to call a non static method , with object only i need to call, so here Bb is class inSide Aa class and i have created a Aa object with that object i can create a object for Bb

        // Aa.Bb cq = new Aa.Bb(); like this also we can do , only when the inner class is static
        c.show1();
    }

}
