public class Pipe extends Product {
    private double diameter;
    private double length;

    public Pipe(double diameter, double length) {
        this.diameter = diameter;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rör - Diameter: " + diameter + " cm, Längd: " + length + " cm";
    }
}
