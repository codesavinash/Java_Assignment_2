package animal;

public class Chicken extends Animal {
  private String eggColor;

  // constructor
  public Chicken(String eggColor) {
    super("Chicken");
    this.eggColor = eggColor;
  }
  // getter
  public String getEggColor() {
    return eggColor;
  }
  // setter
  public void setEggColor(String eggColor) {
    this.eggColor = eggColor;
  }
} // class