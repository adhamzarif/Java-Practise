/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.EmployeeProblem;
import java.util.Scanner;


public class MutipleEmployeeTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int numEmployees = s.nextInt();
        Employee[] employees = new Employee[numEmployees];

        // Input information for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.println("Enter ID:");
            int id = s.nextInt();
            System.out.println("Enter WorkExperience:");
            int workexp = s.nextInt();
            System.out.println("Enter Monthly Salary:");
            double salary = s.nextDouble();
            System.out.println("How many months you want to calculate score:");
            int month = s.nextInt();
            int[] score = new int[month];
            for (int j = 0; j < month; j++) {
                System.out.println("Enter " + (j + 1) + "th month score");
                score[j] = s.nextInt();
            }
            employees[i] = new Employee(id, workexp, salary, score);
        }

        // Display information for all employees
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            employees[i].display();
            employees[i].bonusEligibility();
            employees[i].increment(20);
            employees[i].averageScore();
        }
    }

}
