package Com.Colors;

import java.util.ArrayList;

public class ColorRemove {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<String>();

        // Add colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("White");

        // Display original list
        System.out.println("Original List: " + colors);

        // Remove 2nd element (index = 1)
        colors.remove(1);

        // Remove "Blue" (by object)
        colors.remove("Blue");

        // Display updated list
        System.out.println("After removing elements: " + colors);
    }
}