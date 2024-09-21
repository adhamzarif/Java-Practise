package Week_04.Encapsulation.Ex2;

public class Human extends Animal {
    private String name;

    public Human(String color, int legs, String name) {
        super(color);
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
