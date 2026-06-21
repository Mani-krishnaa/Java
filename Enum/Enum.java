package Enum;


enum Status {
    Running, Failed, Pending, Sucess

}

public class Enum {

    public static void main(String[] args) {
        Status s = Status.Failed;

        switch (s) {
            case Running:
                System.out.println("kfn");
                break;
            case Failed:
                System.out.println("kd");
                break;
            case Pending:
                System.out.println("fmv");
                break;
            case Sucess:
                System.out.println("jorm");
                break;
            default:
                System.out.println("inrveoj");

        }
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss = Status.values(); // Values will return a sritng

        for (Status a : ss) {
            System.out.println(a);
        }

    }
}

/*
 *
 *
 *
 * Enum (Enumeration) is used when you have a fixed set of constants.
 */