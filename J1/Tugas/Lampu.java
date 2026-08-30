package J1.Tugas;

class Lampu {
    String merk;
    int dayaWatt;

    public Lampu(String merk, int dayaWatt) {
        this.merk = merk;
        this.dayaWatt = dayaWatt;
    }

    public void nyalakan() {
        System.out.println("Lampu dinyalakan.");
    }

    public void matikan() {
        System.out.println("Lampu dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Lampu ---");
        System.out.println("Merk: " + merk);
        System.out.println("Daya: " + dayaWatt + " Watt");
    }
}
