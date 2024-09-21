package Week_04.Encapsulation.Ex2;

public class Animal {
    private String color;
    protected int legs;

    public Animal(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    public Animal(String color) {
        this.color = color;
    }

//    public Animal() {
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
