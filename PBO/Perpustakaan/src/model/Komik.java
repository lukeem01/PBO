package model;

public class Komik extends Buku {

    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void tampilkan() {
        System.out.println("=== DATA KOMIK ===");
        super.tampilkan();
    }
}