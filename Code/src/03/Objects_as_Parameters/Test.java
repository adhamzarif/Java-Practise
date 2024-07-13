
package Week_03.Objects_as_Parameters;

import java.util.Scanner;


public class Test {


    public static void main(String[] args) {
        Student s1=new Student(105,"S",3.47);
        s1.getObj(s1);
        System.out.println(s1); // it will work only for toString() method

        Student s3=new Student(99,"James",3.00);
        System.out.println(s3);   // it will work only for toString() method

        //using sendObj() method to send an object
        Student s4=s3.sendObj();
        System.out.println(s4);  // it will work only for toString() method


        Student s2=new Student(10,"'gtg",3.20);
        System.out.println(s2);  // it will work only for toString() method

        //System.out.println("id="+s1.id+" name="+s1.name+" cgpa="+s1.cgpa);
       
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many students' info you want to store:");
        int size=sc.nextInt();
        Student[] student=new Student[size];
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter "+(i+1)+" student's info:" );
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            double cgpa=sc.nextDouble();
            Student s5=new Student(id,name,cgpa);
            student[i]=s5;
        }
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
        //find students whose cgpa>=3.5
        System.out.println("Students whose cgpa is >=3.5");
        for (int i = 0; i < student.length; i++) {
            if (student[i].cgpa>=3.5) {
                System.out.println(student[i]);
            }
        }
        //find students whose name is A
        System.out.println("Students whose name is A");
        for (int i = 0; i < student.length; i++) {
            if (student[i].name.equals("A")) {
                System.out.println(student[i]);
            }

    }

        //search a student by ID
        System.out.println("Enter student's ID you want to search");
        int ID=sc.nextInt();
        for (int i = 0; i < student.length; i++) {
            if (student[i].id==ID)
            {
                System.out.println("student exits!"+"\n"+student[i]);
                break;
            }else{
                System.out.println("Student doesn't exist");
                break;
            }
        }


//search a student by ID and name

System.out.println("Enter student's info you want to search");
    int ID2=sc.nextInt();
    sc.nextLine();
    String name1=sc.nextLine();
        for (int i = 0; i < student.length; i++) {
        if (student[i].id==ID2 && student[i].name.equals(name1)) {
            System.out.println("student exits! "+"\n" +student[i]);
            break;
        }else{
            System.out.println("Student doesn't exist");
            break;
        }
    }

//search a student by ID, name and CGPA

        System.out.println("Enter student's info you want to search");
        int ID3=sc.nextInt();
        sc.nextLine();
        String name2=sc.nextLine();
        double cg=sc.nextDouble();
        for (int i = 0; i < student.length; i++) {
            if (student[i].id==ID3 && student[i].name.equals(name2) && student[i].cgpa==cg)
            {
                System.out.println("student exits!"+student[i]);
                break;
            }else{
                System.out.println("Student doesn't exist");
                break;
            }
        }

    }

}
