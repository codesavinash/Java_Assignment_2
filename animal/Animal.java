package animal;

public abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }
    // getters
    public String getType() {
        return type;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }
} // class