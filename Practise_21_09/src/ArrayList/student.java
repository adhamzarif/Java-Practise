package ArrayList;

import java.util.*;

public class student implements Comparable<student> {
    private String studentname;
    private int rollno;
    private int studentage;

    // Constructor
    public student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    // Getters and Setters
    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    @Override
    public int compareTo(student comparestu) {
        // Sorting by age in ascending order
        return this.studentage - comparestu.getStudentage();
    }

    @Override
    public String toString() {
        return "[Roll No=" + rollno + ", Name=" + studentname + ", Age=" + studentage + "]";
    }

    public static void main(String[] args) {
        ArrayList<student> arraylist = new ArrayList<>();
        arraylist.add(new student(223, "Samit", 26));
        arraylist.add(new student(245, "Subaita", 24));
        arraylist.add(new student(209, "Suhaiba", 32));

        // Sort the list
        Collections.sort(arraylist);

        // Print the sorted list
        for (student student : arraylist) {
            System.out.println(student);
        }
    }
}
