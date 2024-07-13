/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultidimensionalArrays;

/**
 *
 * @author Admin
 */
public class ThreeDArray {
    public static void main(String[] args) {
        
    int [][][] threeDArray={
            {
                {1,2,3,0},
                {2,6,7,8},
                {5,0,5,6},
            },
            {
                {9,2,3,0},
                {8,6,8},
                {6,5,7,6}
            }        
        };
        
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k]+" ");
                }System.out.println("");
            }System.out.println("****************");
        }
           
    }
}
