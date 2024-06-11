// Kelas turunan SepedaMotor
class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " sedang melaju dengan kecepatan " + kecepatan + "km/h.");
    }

    @Override
    public int roda() {
        return 2; // Sepeda motor memiliki 2 roda
    }

    @Override
    public void printMessage() {
        System.out.println("Ini adalah pesan dari kelas Motor.");
    }
}
