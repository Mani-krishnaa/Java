package OOPS;

public class Encapsulation {
    private int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class InnerHuman {

    public static void main(String[] args) {
        Encapsulation h1 = new Encapsulation();
        h1.setAge(12);
        h1.setName("Mani");

        System.out.println(h1.getName());
        System.out.println(h1.getAge());

    }

}
