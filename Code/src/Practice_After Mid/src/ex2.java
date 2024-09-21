import java.util.ArrayList;

public class ex2 {

    public static void main(String args[]){
        ArrayList<Integer> alist=new ArrayList<Integer>();
        alist.add(45);
        alist.add(39);
        alist.add(100);
        alist.add(200);
        alist.add(4);
        alist.add(4);
        alist.add(3);
//displaying elements
        System.out.println(alist);
//Removing "Steve" and "Angela"
        alist.remove(4);

       // alist.remove(100);
//displaying elements
        System.out.println(alist);
//Removing 3rd element
        alist.remove(3);
        //displaying elements
        System.out.println(alist);
    }
}

