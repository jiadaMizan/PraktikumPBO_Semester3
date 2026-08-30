package J1.Tugas;

class LampuKamar extends Lampu {
    String tipeFitting;
    String bentukBohlam;

    public LampuKamar(String merk, int dayaWatt, String tipeFitting, String bentukBohlam) {
        super(merk, dayaWatt);
        this.tipeFitting = tipeFitting;
        this.bentukBohlam = bentukBohlam;
    }

    public void gantiBohlam() {
        System.out.println("Bohlam lampu biasa tipe " + bentukBohlam + " sedang diganti.");
    }

    public void aturWarna(String warna) {
        System.out.println("Warna lampu diatur ke warna : " + warna);
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- Informasi Lampu Kamar ---");
        System.out.println("Merk          : " + merk);
        System.out.println("Daya          : " + dayaWatt + " Watt");
        System.out.println("Tipe Fitting  : " + tipeFitting);
        System.out.println("Bentuk Bohlam : " + bentukBohlam);
    }
}
