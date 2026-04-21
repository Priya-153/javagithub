package Com.ColorSort;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {

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

        // Sort the list
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted ArrayList: " + colors);
    }
}