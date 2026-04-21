package Com.linkedlist;

import java.util.LinkedList;
import java.util.Collections;


public class SwapElement {

	public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("Pink");

        System.out.println("Original List: " + l_list);

        Collections.swap(l_list, 0, 2);

        System.out.println("After Swapping: " + l_list);
    }
}