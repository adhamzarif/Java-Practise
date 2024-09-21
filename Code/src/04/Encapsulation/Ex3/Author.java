package Week_04.Encapsulation.Ex3;

public class Author {
    private String fullName;
    private String phoneNum;
    private String email;

    public Author(String fullName, String phoneNum, String email) {
        this.fullName = fullName;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printAuthorDetails(){
        System.out.println("Author: "+this.fullName+"\nPhone: "+this.phoneNum+"\nEmail: "+this.email);
    }
}
