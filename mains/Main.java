import java.util.Scanner; // Mengimpor kelas Scanner dari package java.util untuk membaca input dari pengguna

public class Main { // Deklarasi kelas utama bernama Main
    public static String pewarnaTulisan = "\u001B[0m"; // Variabel statis untuk menyimpan kode warna default (ANSI escape code), meskipun dalam kode ini tidak digunakan untuk pewarnaan

    public static void printGaris() { // Metode statis untuk mencetak garis pemisah
        System.out.println("====================================="); // Mencetak garis pemisah dengan panjang 33 karakter
    }

    public static void main(String[] args) { // Metode utama (entry point) program yang akan dijalankan pertama kali
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari konsol

        // Header
        printGaris(); // Memanggil metode printGaris untuk mencetak garis pemisah di awal
        System.out.print("Nama\t: "); // Mencetak prompt untuk meminta input nama, dengan tab (\t) untuk jarak
        String nama = scanner.nextLine(); // Membaca input nama dari pengguna sebagai string
        System.out.print("NIM\t: "); // Mencetak prompt untuk meminta input NIM
        String nim = scanner.nextLine(); // Membaca input NIM dari pengguna sebagai string
        printGaris(); // Memanggil metode printGaris untuk mencetak garis pemisah setelah header

        // Circle Section
        System.out.println("Circle"); // Mencetak judul bagian lingkaran
        printGaris(); // Mencetak garis pemisah sebelum input lingkaran
        System.out.print("Isikan ID\t: "); // Mencetak prompt untuk meminta input ID lingkaran
        int circleId = scanner.nextInt(); // Membaca input ID sebagai integer
        System.out.print("Isikan Radius\t: "); // Mencetak prompt untuk meminta input radius
        double radius = scanner.nextDouble(); // Membaca input radius sebagai double
        printGaris(); // Mencetak garis pemisah setelah input

        Circle circle = new Circle(); // Membuat objek baru dari kelas Circle
        circle.setId(circleId); // Mengatur nilai ID lingkaran menggunakan metode setter
        circle.setRadius(radius); // Mengatur nilai radius lingkaran menggunakan metode setter
        circle.printDeskripsi(); // Memanggil metode printDeskripsi untuk menampilkan detail lingkaran (ID, radius, keliling, luas)
        printGaris(); // Mencetak garis pemisah setelah output lingkaran

        // Rectangle Section
        System.out.println("Rectangle"); // Mencetak judul bagian persegi panjang
        printGaris(); // Mencetak garis pemisah sebelum input persegi panjang
        System.out.print("Isikan ID\t: "); // Mencetak prompt untuk meminta input ID persegi panjang
        int rectId = scanner.nextInt(); // Membaca input ID sebagai integer
        System.out.print("Isikan Panjang\t: "); // Mencetak prompt untuk meminta input panjang
        double panjang = scanner.nextDouble(); // Membaca input panjang sebagai double
        System.out.print("Isikan Lebar\t: "); // Mencetak prompt untuk meminta input lebar
        double lebar = scanner.nextDouble(); // Membaca input lebar sebagai double
        printGaris(); // Mencetak garis pemisah setelah input

        Rectangle rectangle = new Rectangle(rectId, panjang, lebar); // Membuat objek baru dari kelas Rectangle dengan parameter ID, panjang, dan lebar
        rectangle.printDeskripsi(); // Memanggil metode printDeskripsi untuk menampilkan detail persegi panjang (ID, panjang, lebar, keliling, luas)
        printGaris(); // Mencetak garis pemisah setelah output persegi panjang

        scanner.close(); // Menutup objek Scanner untuk membebaskan sumber daya
    }
}