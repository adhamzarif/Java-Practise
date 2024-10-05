package ArrayList;

import java.util.*;
public class Main10{
    public static void main(String args[]){
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);
        //Before sorting
        System.out.println("Before Sorting: "+ arraylist);
        // Sorting the list of integers using sort() method
        Collections.sort(arraylist);
        //After sorting
        System.out.println("After Sorting: "+ arraylist);
    }
}
