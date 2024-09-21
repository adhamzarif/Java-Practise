package ArrayList;

import java.util.*;
public class Main11 {
    public static void main(String args[]) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Apple");
        arraylist.add("Orange");
        arraylist.add("Kiwi");
        arraylist.add("Banana");
        arraylist.add("Mango");
        //Before sorting
        System.out.println("Before Sorting: " + arraylist);
        // Sorting the list in descending order
        Collections.sort(arraylist, Collections.reverseOrder());
        //After sorting
        System.out.println("After Sorting: " + arraylist);
    }
}