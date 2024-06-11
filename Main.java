// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Sepeda("BMX", 15);
        Kendaraan kendaraan2 = new Mobil("Toyota", 80);
        Kendaraan kendaraan3 = new SepedaMotor("Motor", 60);

        kendaraan1.bergerak();
        kendaraan2.bergerak();
        kendaraan3.bergerak();

        kendaraan1.printMessage();
        kendaraan2.printMessage();
        kendaraan3.printMessage();

        System.out.println(kendaraan1.nama + " memiliki " + kendaraan1.roda() + " roda.");
        System.out.println(kendaraan2.nama + " memiliki " + kendaraan2.roda() + " roda.");
        System.out.println(kendaraan3.nama + " memiliki " + kendaraan3.roda() + " roda.");
    }
}