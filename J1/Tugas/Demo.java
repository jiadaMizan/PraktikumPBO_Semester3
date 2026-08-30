package J1.Tugas;

public class Demo {
    public static void main(String[] args) {
        Lampu lampuUmum = new Lampu("Philips", 15);
        LampuKamar lampuBiasa = new LampuKamar("Osram", 9, "E27", "Bulat");
        LampuPanjang lampuPanjang = new LampuPanjang("Hannochs", 18, 120, "T8 LED");
        PapanTulis papanTulis = new PapanTulis("Putih", "Hitam");
        Proyektor proyektor = new Proyektor("1920x1080 (FHD)", 3500);

        lampuUmum.cetakInformasi();
        lampuUmum.nyalakan();
        lampuUmum.matikan();
        System.out.println();

        lampuBiasa.cetakInformasi();
        lampuBiasa.nyalakan();
        lampuBiasa.aturWarna("Kuning");
        lampuBiasa.gantiBohlam();
        System.out.println();

        lampuPanjang.cetakInformasi();
        lampuPanjang.nyalakan();
        lampuPanjang.pasangStarter();
        lampuPanjang.gantiKonektor();
        System.out.println();

        papanTulis.cetakInformasi();
        papanTulis.tulisTeks("Materi Pewarisan (Inheritance) Java");
        papanTulis.hapusPapan();
        System.out.println();

        proyektor.cetakInformasi();
        proyektor.sambungkanHDMI();
        proyektor.aturFokus();
    }
}
