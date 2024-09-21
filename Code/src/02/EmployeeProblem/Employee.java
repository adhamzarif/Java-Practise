/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.EmployeeProblem;


public class Employee {
    int id;
    int workExperience;
    double salary;
    int[] score;
    Employee(int id, int workExperience, double salary, int[] score){
        this.id=id;
        this.workExperience=workExperience;
        this.salary=salary;
        int size=score.length;
        this.score=new int[size];
        for (int i = 0; i < size; i++) {
            this.score[i]=score[i];
        }
    }
    void bonusEligibility(){
        if (workExperience>10 || salary<10000) {
            System.out.println("Eligible for bonus");
        }else{
            System.out.println("not eligible for bonus");
        }
    }
    void increment(int inc){
        salary=salary+salary*inc/100;
        System.out.println("incremented salary: "+salary);
    }
    
    int sum=0;
    double average;
    void averageScore(){
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
             average=sum/score.length; 
        }
         System.out.println("average score="+average);
   
    }

    void display(){
        System.out.println("");
        System.out.println("Employee id= "+id);
        System.out.println("workExperience in years= "+workExperience);
        System.out.println("monthly salary= "+salary);
        System.out.println("");
    }
}
