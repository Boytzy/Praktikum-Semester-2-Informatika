package Kegiatan3;
public class main {
    public static void main(String[] args) {
        Lingkaran lkrn = new Lingkaran();
        lkrn.setJari();
        lkrn.display();

        Tabung tbng = new Tabung();
        tbng.setJari();
        tbng.setTinggi();
        tbng.display();

        Persegi prsg = new Persegi();
        prsg.setSisi();
        prsg.display();

        Limas lms = new Limas();
        lms.setSisi();
        lms.setTinggi();
        lms.getVolume();
        lms.display();
    }
}