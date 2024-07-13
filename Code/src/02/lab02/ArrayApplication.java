/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.lab02;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ArrayApplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//       int[][] arr=new int[2][3];
//        System.out.println("Enter Array Elements:");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j]=input.nextInt();
//            }
//        }
//        System.out.println("Your array is:");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }
         int[][][] threeDArray = {
                                 {
                                  {1,2,3,4},
                                  {5,5,5,5},
                                  {0,1,2,3}
                                 },
                                 {
                                  {0,0,0,0},
                                  {1,1,1,1},
                                  {2,2,2,2}}};
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k]+" ");
                }System.out.println("");
            }System.out.println("***********");
        }
    }
    
}
