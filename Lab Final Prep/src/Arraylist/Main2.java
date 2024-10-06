package Arraylist;

public class Main2
{
    public static void main(String[] args)
    {
        // An int array that can store upto 5 elements
        // Name of the array is "number"
        int number[]=new int[5];
        //storing values in the array
        number[0]=100; //first element
        number[1]=101; //second element
        number[2]=200; //third element
        number[3]=250; //fourth element
        number[4]=10; //fifth element
        //printing the elements of array "number"
        for(int i=0;i<number.length;i++)
        {
            System.out.println("number["+i+"]: "+number[i]);
        }
    }
}