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
        System.out.println(list);

    }
}
