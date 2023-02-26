package Collections;

import java.util.HashSet;
import java.util.Set;

public class HastSetTest {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<>();
        hash.add("Ashraf");
        hash.add("Tanvir");
        hash.add("Ashraf");
        System.out.println(hash);
        System.out.println("list contains Ashraf or not? "+hash.contains("Ashraf"));
        hash.remove("Tanvir");
        for (String item: hash){
            System.out.println(item);
        }
    }
}
