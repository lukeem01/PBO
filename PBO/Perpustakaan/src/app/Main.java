package app;

import java.util.Scanner;

import collection.DataBuku;
import generic.Data;
import model.Buku;
import model.Komik;
import model.Novel;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DataBuku dataBuku = new DataBuku();

        Data<String> informasi = new Data<>();
        informasi.setData("Sistem Perpustakaan Java");

        int pilih;

        do {

            System.out.println("\n=========================");
            System.out.println(informasi.getData());
            System.out.println("=========================");
            System.out.println("1. Tambah Novel");
            System.out.println("2. Tambah Komik");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Judul Novel   : ");
                    String judulNovel = input.nextLine();

                    System.out.print("Penulis Novel : ");
                    String penulisNovel = input.nextLine();

                    Buku novel = new Novel(judulNovel, penulisNovel);

                    dataBuku.tambahBuku(novel);

                    System.out.println("Novel berhasil ditambahkan.");

                    break;

                case 2:

                    System.out.print("Judul Komik   : ");
                    String judulKomik = input.nextLine();

                    System.out.print("Penulis Komik : ");
                    String penulisKomik = input.nextLine();

                    Buku komik = new Komik(judulKomik, penulisKomik);

                    dataBuku.tambahBuku(komik);

                    System.out.println("Komik berhasil ditambahkan.");

                    break;

                case 3:

                    dataBuku.tampilkanSemua();

                    break;

                case 4:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 4);

        input.close();
    }
}