package Collections;

import java.util.TreeSet;
import java.util.Set;
public class TreeSetTest {
    public static void main(String[] args) {
        System.out.println("Collections || TreeSet");
        Set<String> treeset = new TreeSet<String>();
        treeset.add("D");
        treeset.add("B");
        treeset.add("A");

        System.out.println(treeset); //print letter order sorted
    }
}
