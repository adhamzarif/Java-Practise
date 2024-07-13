package Week_04.Encapsulation.Ex2;

public class HumanModified extends AnimalModified {
    String color;
    private String name;

    public HumanModified(String color, int legs, String name) {
        this.color = color;
        this.legs = legs;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
