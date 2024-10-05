package ArrayList;

import java.util.*;
public class Main3
{
    public static void main(String[] args)
    {
        //Creating an ArrayList of strings
        //Name of the arraylist is "al" This line creates an ArrayList named al that
        //can hold elements of type String.

        ArrayList<String> al = new ArrayList<String>();
        //adding elements to the arraylist using add()
        al.add("Welcome");
        al.add("to");
        al.add("OOP");
        al.add("Java");
//        printing the elements of the arraylis. This loop iterates through each
//        element in the ArrayList al, assigning each element to the variable str, and then
//        printing the value of str using System.out.println(str);.

        for(String str:al)
        {
            System.out.println(str);
        }
        //You can also print the complete arraylist like this
        //This line prints the entire ArrayList al in its current state
        System.out.println(al);
    }
}
