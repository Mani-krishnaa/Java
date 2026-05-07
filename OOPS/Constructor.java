package OOPS;

public class Constructor {

    private int age;
    private String name;

    public Constructor() {
        age = 12;
        name = "Jhon";
        System.out.println("In constructor");
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

class InnerConstructor {
    public static void main(String[] args) {
        Constructor co = new Constructor();
        System.out.println(co.getAge() + " " + co.getName());

    }

}
