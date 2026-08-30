package J1.Tugas;

class PapanTulis {
    String warnaPapan;
    String jenisTintaSpidol;

    public PapanTulis(String warnaPapan, String jenisTintaSpidol) {
        this.warnaPapan = warnaPapan;
        this.jenisTintaSpidol = jenisTintaSpidol;
    }

    public void tulisTeks(String teks) {
        System.out.println("Menulis di papan " + warnaPapan + " menggunakan spidol " + jenisTintaSpidol + ": \"" + teks + "\"");
    }

    public void hapusPapan() {
        System.out.println("Papan tulis telah dibersihkan menggunakan penghapus.");
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Papan Tulis ---");
        System.out.println("Warna Papan: " + warnaPapan);
        System.out.println("Basis Tinta Spidol: " + jenisTintaSpidol);
    }
}
