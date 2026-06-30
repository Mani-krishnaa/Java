package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set
 *
 * Unique elements only
 * No order is preserved
 *
 *
 * Hashset
 * No duplicates
 * No insertion order guarantee
 * Fast operations
 *
 * Treeset
 * Automatically sort elements
 */
public class Sets {
    public static void main(String[] args) {

        Set<Integer> b = new HashSet<Integer>();
        b.add(100);
        b.add(30);
        b.add(1300);
        b.add(1030);
        b.add(1030);

        Set<Integer> a = new TreeSet<Integer>();
        a.add(100);
        a.add(30);
        a.add(1300);
        a.add(1030);
        a.add(1030);

        // Iterator , instead of using for loop, it will give you iterator object,
        // basically it will itearate

        Iterator<Integer> values = a.iterator();
        Iterator<Integer> valuess = b.iterator();

        System.out.println(values);
        System.out.println(valuess);

        for (Integer integer : a) {
            System.out.println(integer);

        }
        System.out.println();

        for (Integer integer : b) {
            System.out.println(integer);

        }

        // for (Integer integer : a) {
        // System.out.println(integer);

        // }

    }

}