public class Rectangle { // Deklarasi kelas Rectangle untuk merepresentasikan objek persegi panjang
    private int id; // Variabel instance untuk menyimpan ID persegi panjang, bersifat private untuk enkapsulasi
    private double panjang; // Variabel instance untuk menyimpan panjang persegi panjang, bertipe double karena bisa desimal
    private double lebar; // Variabel instance untuk menyimpan lebar persegi panjang, bertipe double karena bisa desimal

    public Rectangle(int id, double panjang, double lebar) { // Konstruktor dengan parameter untuk menginisialisasi ID, panjang, dan lebar
        this.id = id; // Menginisialisasi ID dengan nilai dari parameter id
        this.panjang = panjang; // Menginisialisasi panjang dengan nilai dari parameter panjang
        this.lebar = lebar; // Menginisialisasi lebar dengan nilai dari parameter lebar
    }

    public int getId() { // Metode getter untuk mengembalikan nilai ID persegi panjang
        return id; // Mengembalikan nilai variabel instance id
    }

    public double getPanjang() { // Metode getter untuk mengembalikan nilai panjang persegi panjang
        return panjang; // Mengembalikan nilai variabel instance panjang
    }

    public double getLebar() { // Metode getter untuk mengembalikan nilai lebar persegi panjang
        return lebar; // Mengembalikan nilai variabel instance lebar
    }

    public double getKeliling() { // Metode getter untuk menghitung dan mengembalikan keliling persegi panjang
        // Keliling = 2 * (panjang + lebar)
        return 2 * (panjang + lebar); // Mengembalikan hasil perhitungan keliling
    }

    public double getLuas() { // Metode getter untuk menghitung dan mengembalikan luas persegi panjang
        // Luas = panjang * lebar
        return panjang * lebar; // Mengembalikan hasil perhitungan luas
    }

    public void printDeskripsi() { // Metode untuk mencetak deskripsi persegi panjang sesuai format yang diminta
        System.out.println("ID\t\t: " + id); // Mencetak ID persegi panjang dengan tab untuk jarak
        System.out.println("Panjang\t: " + panjang); // Mencetak panjang persegi panjang dengan tab untuk jarak
        System.out.println("Lebar\t\t: " + lebar); // Mencetak lebar persegi panjang dengan tab untuk jarak
        System.out.println("Keliling\t: " + getKeliling()); // Mencetak keliling persegi panjang menggunakan metode getKeliling
        System.out.println("Luas\t\t: " + getLuas()); // Mencetak luas persegi panjang menggunakan metode getLuas
    }
}