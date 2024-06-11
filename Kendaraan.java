// Kelas dasar Kendaraan (Vehicle)
class Kendaraan {
    String nama;
    int kecepatan;

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void bergerak() {
        System.out.println(nama + " sedang bergerak dengan kecepatan " + kecepatan + " km/h.");
    }

    public void printMessage() {
        System.out.println("Ini adalah pesan dari kelas Kendaraan.");
    }

    public int roda() {
        return 0; // Default tidak ada roda
    }
}
