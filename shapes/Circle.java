public class Circle { // Deklarasi kelas Circle untuk merepresentasikan objek lingkaran
    private int id; // Variabel instance untuk menyimpan ID lingkaran, bersifat private agar hanya dapat diakses melalui metode getter/setter
    private double radius; // Variabel instance untuk menyimpan radius lingkaran, bertipe double karena radius bisa desimal
    private final int pembilang = 22; // Konstanta pembilang untuk nilai π (22/7), bersifat final sehingga tidak dapat diubah
    private final int penyebut = 7; // Konstanta penyebut untuk nilai π (22/7), bersifat final sehingga tidak dapat diubah

    public Circle() { // Konstruktor tanpa parameter untuk membuat objek Circle dengan nilai default
        this.id = 0; // Menginisialisasi ID dengan nilai 0 sebagai default
        this.radius = 0.0; // Menginisialisasi radius dengan nilai 0.0 sebagai default
    }

    public void setId(int id) { // Metode setter untuk mengatur nilai ID lingkaran
        this.id = id; // Menyimpan nilai parameter id ke variabel instance id
    }

    public void setRadius(double radius) { // Metode setter untuk mengatur nilai radius lingkaran
        this.radius = radius; // Menyimpan nilai parameter radius ke variabel instance radius
    }

    public double getKeliling() { // Metode getter untuk menghitung dan mengembalikan keliling lingkaran
        // Keliling = 2 * π * radius, di mana π diaproksimasi sebagai pembilang/penyebut (22/7)
        return 2 * (pembilang / (double)penyebut) * radius; // Mengembalikan hasil perhitungan keliling
    }

    public double getLuas() { // Metode getter untuk menghitung dan mengembalikan luas lingkaran
        // Luas = π * radius * radius, di mana π diaproksimasi sebagai pembilang/penyebut (22/7)
        return (pembilang / (double)penyebut) * radius * radius; // Mengembalikan hasil perhitungan luas
    }

    public void printDeskripsi() { // Metode untuk mencetak deskripsi lingkaran sesuai format yang diminta
        System.out.println("ID\t\t: " + id); // Mencetak ID lingkaran dengan tab untuk jarak
        System.out.println("Radius\t\t: " + radius); // Mencetak radius lingkaran dengan tab untuk jarak
        System.out.println("Keliling\t: " + getKeliling()); // Mencetak keliling lingkaran menggunakan metode getKeliling
        System.out.println("Luas\t\t: " + getLuas()); // Mencetak luas lingkaran menggunakan metode getLuas
    }
}