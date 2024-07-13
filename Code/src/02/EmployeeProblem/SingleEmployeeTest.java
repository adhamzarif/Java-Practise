/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.EmployeeProblem;
import java.util.Scanner;


public class SingleEmployeeTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        System.out.println("Enter ID:");
        int id=s.nextInt();
        System.out.println("Enter WorkExperience:");
        int workexp=s.nextInt();
        System.out.println("Enter Monthly Salary:");
        double salary=s.nextDouble();
        System.out.println("How many months you want to calculate score:");
        int month=s.nextInt();
        int score[]=new int[month];
        for (int i = 0; i < month; i++) {
            System.out.println("Enter "+i+" th month score");
            score[i]=s.nextInt();
        }
        Employee e1=new Employee(id,workexp,salary,score);
        e1.display();
        e1.bonusEligibility();
        e1.increment(20);
        e1.averageScore();

        
    }
}
