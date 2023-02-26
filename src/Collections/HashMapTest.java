package Collections;

import java.util.HashMap;
import java.util.Map;
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        //hashmap The main difference between Set and Map is that Set is unordered and contains different elements, whereas Map contains the data in the key-value pair.
        hashmap.put("a", 10);
        hashmap.put("c", 30);
        hashmap.put("e", 50);
        System.out.println(hashmap);
        System.out.println(hashmap.keySet());
        System.out.println("the size of the hashmap is: " +hashmap.size());
        if (hashmap.containsKey("a")) {
            Integer a = hashmap.get("a");
            System.out.println("value for key is: " + " " +a);
        }
        for (String key: hashmap.keySet()){
            System.out.println("key: "+key + ", value: " +hashmap.get(key));
        }
    }
}