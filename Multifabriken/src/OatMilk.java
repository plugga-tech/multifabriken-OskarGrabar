public class OatMilk extends Product {
    private double fatContent;
    private double liters;

    public OatMilk(double fatContent, double liters) {
        this.fatContent = fatContent;
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Havremjölk - Fetthalt: " + fatContent + "%, Litermängd: " + liters + " L";
    }
}
