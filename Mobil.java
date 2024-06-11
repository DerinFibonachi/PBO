// Kelas turunan Mobil
class Mobil extends Kendaraan {
    public Mobil(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " sedang melaju dengan kecepatan " + kecepatan + " km/h.");
    }

    @Override
    public int roda() {
        return 4; // Mobil memiliki 4 roda
    }

    @Override
    public void printMessage() {
        System.out.println("Ini adalah pesan dari kelas Mobil.");
    }
}
