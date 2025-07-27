
package animal;

public class Cow extends Animal {
    private int milkPerDay;

    // Constructor
    public Cow(int milkPerDay) {
        super("Cow");
        this.milkPerDay = milkPerDay;
    }

    // Getter
    public int getMilkPerDay() {
        return milkPerDay;
    }

    // Setter
    public void setMilkPerDay(int milkPerDay) {
        this.milkPerDay = milkPerDay;
    }
}