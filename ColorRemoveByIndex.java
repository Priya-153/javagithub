package Com.ColorSort;

import java.util.ArrayList;

public class ColorRemoveByIndex {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<String>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display original list
        System.out.println("Original ArrayList: " + colors);

        int n = 3; // remove 3rd element

        // Remove nth element (index = n - 1)
        colors.remove(n - 1);

        // Display updated list
        System.out.println("After removing " + n + "rd element: " + colors);
    }
}