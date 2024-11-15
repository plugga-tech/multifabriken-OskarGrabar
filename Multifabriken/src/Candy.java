public class Candy extends Product {
    private String flavor;
    private int quantity;

    public Candy(String flavor, int quantity) {
        this.flavor = flavor;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Godis - Smak: " + flavor + ", Antal: " + quantity;
    }
}
