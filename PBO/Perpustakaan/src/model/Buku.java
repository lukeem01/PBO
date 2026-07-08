package model;

import abstracts.Item;
import interfaces.Pinjam;

public class Buku extends Item implements Pinjam {

    private String penulis;

    public Buku(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    @Override
    public void tampilkan() {
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
    }

    @Override
    public void pinjam() {
        System.out.println(judul + " berhasil dipinjam");
    }
}