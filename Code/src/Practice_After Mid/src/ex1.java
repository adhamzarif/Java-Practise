import java.util.*;
public class ex1 {
        public static void main(String args[]){
            ArrayList<String> alist=new ArrayList<String>();
            alist.add("Steve");
            alist.add("Steve");
            alist.add("Tim");
            alist.add("Lucy");
            alist.add("Steve");
            alist.add("Pat");
            alist.add("Angela");
            alist.add("Tom");
//displaying elements
            System.out.println(alist);
//Removing "Steve" and "Angela"
            alist.remove("Steve");
            alist.remove("Steve");
            alist.remove("Angela");
//displaying elements
            System.out.println(alist);
//Removing 3rd element
            alist.remove(2);
//displaying elements
            System.out.println(alist);
        }
    }

