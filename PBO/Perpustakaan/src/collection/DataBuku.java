package collection;

import java.util.ArrayList;
import model.Buku;

public class DataBuku {

    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemua() {

        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada data buku.");
            return;
        }

        for (Buku b : daftarBuku) {
            b.tampilkan();
            System.out.println("-------------------");
        }
    }
}