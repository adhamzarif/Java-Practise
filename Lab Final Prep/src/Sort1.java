import java.util.*;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    // Implementing the compareTo method to sort by age, then by name if ages are the same
    @Override
    public int compareTo(Student other) {
        if (this.age != other.age) {
            return Integer.compare(this.age, other.age); // Sort by age
        } else {
            return this.name.compareTo(other.name); // Sort by name if ages are the same
        }
    }
}

public class Sort1 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));
        al.add(new Student(102, "Amit", 23)); // Adding another student with the same age as Vijay

        Collections.sort(al); // Sort the students

        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}