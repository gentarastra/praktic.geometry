public class Circle {
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    public Circle() {
        this.id = 0;
        this.radius = 0.0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getKeliling() {
        return 2 * (pembilang / (double) penyebut) * radius;
    }

    public double getLuas() {
        return (pembilang / (double) penyebut) * radius * radius;
    }

    public void printDeskripsi() {
        System.out.println("ID\t\t: " + id);
        System.out.println("Radius\t\t: " + radius);
        System.out.println("Keliling\t: " + getKeliling());
        System.out.println("Luas\t\t: " + getLuas());
    }
}