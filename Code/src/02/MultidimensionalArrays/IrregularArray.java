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
public class IrregularArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int r = sc.nextInt();
        int c;
        int A[][] = new int[r][];
        int B[][] = new int[r][];
        int C[][] = new int[r][];
        for (int i = 0; i < r; i++) {
            System.out.print("Enter column:");
            c = sc.nextInt();
            A[i] = new int[c];
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your irregular 2D array is:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Enter B:");
        for (int i = 0; i < r; i++) {
            c = A[i].length;
            B[i] = new int[c];
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("C is:");
        for (int i = 0; i < r; i++) {
            c = A[i].length;
            C[i] = new int[c];
            for (int j = 0; j < c; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
