package J1.Tugas;

class LampuPanjang extends Lampu {
    int panjangCm;
    String jenisTabung; 

    public LampuPanjang(String merk, int dayaWatt, int panjangCm, String jenisTabung) {
        super(merk, dayaWatt);
        this.panjangCm = panjangCm;
        this.jenisTabung = jenisTabung;
    }

    public void pasangStarter() {
        System.out.println("Starter tabung " + jenisTabung + " dipasang.");
    }

    public void gantiKonektor() {
        System.out.println("Konektor ujung tabung panjang diganti.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- Informasi Lampu Panjang ---");
        System.out.println("Merk         : " + merk);
        System.out.println("Daya         : " + dayaWatt + " Watt");
        System.out.println("Panjang      : " + panjangCm + " cm");
        System.out.println("Jenis Tabung : " + jenisTabung);
    }
}
