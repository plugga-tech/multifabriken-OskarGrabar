import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static List<Product> orderedProducts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Produktbeställningsmeny ---");
            System.out.println("1. Beställ Bil");
            System.out.println("2. Beställ Godis");
            System.out.println("3. Beställ Rör");
            System.out.println("4. Beställ Havremjölk");
            System.out.println("5. Lista alla beställningar");
            System.out.println("6. Avsluta");
            System.out.print("Välj ett alternativ: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> orderedProducts.add(createCar(scanner));
                case 2 -> System.out.println(2);
                case 3 -> System.out.println(3);
                case 4 -> System.out.println(4);
                case 5 -> listOrders();
                case 6 -> running = false;
                default -> System.out.println("Ogiltigt val, försök igen.");
            }
        }
        scanner.close();
    }
    private static Car createCar(Scanner scanner) {
        System.out.print("Ange registreringsnummer: ");
        String regNum = scanner.nextLine();
        System.out.print("Ange färg: ");
        String color = scanner.nextLine();
        System.out.print("Ange bilmärke: ");
        String brand = scanner.nextLine();
        return new Car(regNum, color, brand);
    }

    private static void listOrders() {
        if (orderedProducts.isEmpty()) {
            System.out.println("Inga beställningar gjorda.");
        } else {
            System.out.println("\n--- Beställda Produkter ---");
            for (Product product : orderedProducts) {
                System.out.println(product);
            }
        }
    }
}
