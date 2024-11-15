public class Car extends Product {
    private String regNum;
    private String color;
    private String brand;

    public Car(String regNum, String color, String brand) {
        this.regNum = regNum;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bil - Registreringsnummer: " + regNum + ", Färg: " + color + ", Bilmärke: " + brand;
    }
}
