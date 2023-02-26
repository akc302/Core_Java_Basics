package Collections;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("Collections || Linked List");
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ashraf");
        list.add("Tanvir");
        list.addLast("Matlub");
        list.addFirst("Tamim");
        list.add(2,"Rakib");
        System.out.println(list);
        list.remove(2);
        list.remove("Rakib");
        System.out.println(list);

    }
}
