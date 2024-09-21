package ArrayList;

import java.util.*;
public class Main12 {
    public static void main(String[] args) {
        int i = 0, size;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("How many elements you want in list? ");
        size = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter elements: ");
        while (i < size) {
            list.add(scan2.nextLine());
            i++;
        }
        //Before sorting
        System.out.println("Before Sorting: " + list);
        // Sorting the list in descending order
        Collections.sort(list, Collections.reverseOrder());
        //After sorting
        System.out.println("After Sorting: " + list);
    }
}