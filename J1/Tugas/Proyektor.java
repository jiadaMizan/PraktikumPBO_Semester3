package J1.Tugas;

class Proyektor {
    String resolusi;
    int lumens;

    public Proyektor(String resolusi, int lumens) {
        this.resolusi = resolusi;
        this.lumens = lumens;
    }

    public void sambungkanHDMI() {
        System.out.println("Proyektor terhubung ke input HDMI.");
    }

    public void aturFokus() {
        System.out.println("Lensa proyektor sedang disesuaikan agar gambar fokus.");
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Proyektor ---");
        System.out.println("Resolusi: " + resolusi);
        System.out.println("Tingkat Kecerahan: " + lumens + " Lumens");
    }
}