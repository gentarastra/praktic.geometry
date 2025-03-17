import java.util.Scanner;

public class Main {
    public static String pewarnaTulisan = "\u001B[0m"; // Default color

    public static void printGaris() {
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        printGaris();
        System.out.print("Nama\t: ");
        String nama = scanner.nextLine();
        System.out.print("NIM\t: ");
        String nim = scanner.nextLine();
        printGaris();

        // Circle Section
        System.out.println("Circle");
        printGaris();
        System.out.print("Isikan ID\t: ");
        int circleId = scanner.nextInt();
        System.out.print("Isikan Radius\t: ");
        double radius = scanner.nextDouble();
        printGaris();

        Circle circle = new Circle();
        circle.setId(circleId);
        circle.setRadius(radius);
        circle.printDeskripsi();
        printGaris();

        // Rectangle Section
        System.out.println("Rectangle");
        printGaris();
        System.out.print("Isikan ID\t: ");
        int rectId = scanner.nextInt();
        System.out.print("Isikan Panjang\t: ");
        double panjang = scanner.nextDouble();
        System.out.print("Isikan Lebar\t: ");
        double lebar = scanner.nextDouble();
        printGaris();

        Rectangle rectangle = new Rectangle(rectId, panjang, lebar);
        rectangle.printDeskripsi();
        printGaris();

        scanner.close();
    }
}