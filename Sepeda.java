// Kelas turunan Sepeda
class Sepeda extends Kendaraan {
    public Sepeda(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " sedang dikayuh dengan kecepatan " + kecepatan + " km/h.");
    }

    @Override
    public int roda() {
        return 2; // Sepeda memiliki 2 roda
    }
}
