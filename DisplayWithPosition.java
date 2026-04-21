package Com.Example.linkedlist;

import java.util.LinkedList;

public class DisplayWithPosition {

    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Add elements
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Blue");
        l_listobj.add("Pink");

        // Display elements with their positions
        System.out.println("Elements with their positions:");
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + " : " + l_listobj.get(p));
        }
    }
}