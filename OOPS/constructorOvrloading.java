package OOPS;

public class constructorOvrloading {

    private int age;
    private String name;

    public constructorOvrloading(int age, String name) { // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public constructorOvrloading() { // default constructor
        age = 12;
        name = "mani";
    }

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

class InnerConstructor1 {
    public static void main(String[] args) {
        constructorOvrloading co = new constructorOvrloading();
        constructorOvrloading co1 = new constructorOvrloading(17, "Krishna");

        System.out.println(co.getAge() + " " + co.getName());
        System.out.println(co1.getAge() + " " + co1.getName());

    }

}
