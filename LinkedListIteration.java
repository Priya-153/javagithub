package Com.LinkedListDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");

        // Display original list
        System.out.println("LinkedList: " + list);

        // Start from 2nd position (index 1)
        ListIterator<String> iteratorObj = list.listIterator(1);

        System.out.println("Elements from 2nd position:");

        // Iterate from index 1 onwards
        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
    }
}