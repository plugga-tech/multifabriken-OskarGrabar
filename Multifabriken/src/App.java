import java.util.Scanner;

public class App {

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
                case 1 -> System.out.println(1);
                case 2 -> System.out.println(2);
                case 3 -> System.out.println(3);
                case 4 -> System.out.println(4);
                case 5 -> System.out.println(5);
                case 6 -> running = false;
                default -> System.out.println("Ogiltigt val, försök igen.");
            }
        }
        scanner.close();
    }
}
