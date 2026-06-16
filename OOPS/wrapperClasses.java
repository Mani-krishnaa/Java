package OOPS;

public class wrapperClasses {

    public static void main(String[] args) {
        int a = 1;
        // Java internally does is
        // Integer obj = Integer.valueOf(num);
        Integer b = a; // Autoboxing

        Integer obj = 2;
        int c = obj; // AutoUnboxing

        System.out.println(b);
        System.out.println(c);

    }
}

/*
 * A Wrapper Class is a class that wraps a primitive data type into an object.
 * Why Do We Need Wrapper Classes?
 *
 * Some Java APIs and Collections work only with objects, not primitives.
 * ❌ This is not allowed:
 * ArrayList<int> list = new ArrayList<>();
 *
 *
 * ✅ Use Wrapper Class:
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(10);
 * list.add(20);
 *
 *
 * What is the difference between int and Integer?
 * int = Primitive type
 * Integer =Object
 *
 * 🔹 Real-world Usage
 * 
 * You'll use Wrapper Classes a lot in:
 * 
 * ArrayList<Integer>
 * HashMap<String, Integer>
 * Database values
 * JSON responses
 * Spring Boot applications
 */