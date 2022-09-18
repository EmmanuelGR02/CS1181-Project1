public class Item {
    private final String name;
    private final double weight;
    private final int value;
    private boolean included;

    // Constructor 
    public Item(String name, double weight, int value, boolean included) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.included = false;
    }

    // Constructor for a different item
    public Item (Item other) {
        this.name = other.name;
        this.weight = other.weight;
        this.value = other.value;
        this.included = false;
    }

    // Getters
    public double getWeight() { return weight; }
    public int getValue() { return value; }
    public boolean isIncluded() { return included; }

    // Setter
    public void setIncluded(boolean included) {
        this.included = included;
    }

    public String toString() {
        return name + " (" + weight + "lbs, " + "$" + value + ")";  
    }

}