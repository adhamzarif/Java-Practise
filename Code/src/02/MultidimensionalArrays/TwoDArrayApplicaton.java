/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultidimensionalArrays;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TwoDArrayApplicaton {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter row and column numbers:");
        int row=s.nextInt();
        int col=s.nextInt();
        
        int[][] A=new int[row][col];
        int[][] B=new int[row][col];
        int[][] C=new int[row][col];
        
        System.out.println("Enter matrix A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter matrix B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j]=s.nextInt();
            }
        }
         System.out.println("Your matrix C is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            } System.out.println("");
        }
       
    }
}
