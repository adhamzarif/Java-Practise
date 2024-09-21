/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_04.Inheritence;

/**
 *
 * @author Admin
 */
public class Teacher extends University{
    String designation;
    
    Teacher(int id, String name, String designation){
        super(id,name);
        this.designation=designation;
    }
}
