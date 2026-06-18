
interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("In Laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("In Desktop");
    }
}

class Developer {
    public void Develop(Computer c) {
        c.code();
    }
}

class InnerDeveloper {
    public static void main(String[] args) {
        Computer c = new Laptop();
        Computer cc = new Desktop();

        Developer d = new Developer();
        d.Develop(cc);
        d.Develop(c);

    }
}