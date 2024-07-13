package Week_04.Encapsulation.Ex1;

/**
 *
 * @author Admin
 */
public class Encap_test {
    public static void main(String[] args) {
        Student s1=new Student();
       s1.setId(5);
       s1.getId();
       s1.setName("A");
        System.out.println(s1.getName());
    }
}
