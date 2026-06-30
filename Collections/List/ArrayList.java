package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList
 */
class ArrayListDemo {

    public static void main(String[] args) {
        // Declaring ArrayList ⬇️

        // ArrayList a = new ArrayList();

        // Using generics to store homogeneous data
        // ArrayList<Integer> a1 = new ArrayList<>();
        // ArrayList<String> a2 = new ArrayList<>();

        // List is parent interface so we can we can store object to list as well

        // List a1 = new ArrayList();

        ArrayList<Comparable> a = new ArrayList<>();

        // adding elements to arraylist
        a.add(100);
        a.add("welcome");
        a.add(15.5);
        a.add(true);

        System.out.println(a);

        System.out.println(a.size()); // SIze method will print the size of the array

        a.remove(3);
        System.out.println(a);

        // Accesing

        for (int i = 0; i < a.size(); i++) {

            System.out.println(a.get(i));
        }

        for (Object object : a) {
            System.out.println(object);

        }

        Iterator id = a.iterator();
        while (id.hasNext()) {
            System.out.println(id.next());
        }

    }

}