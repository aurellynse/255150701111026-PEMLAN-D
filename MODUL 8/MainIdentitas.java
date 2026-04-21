package Interface2;

import java.util.Scanner;

public class MainIdentitas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input user (no.7)
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // object manusia (no.6)
        Manusia aurel = new Manusia(nama, umur);

        aurel.tampilkanNama();
        aurel.tampilkanUmur();
        aurel.makan();
        aurel.berjalan();
        aurel.bersuara();

        System.out.println();

        // objek lain (no.8)
        Hewan h = new Hewan();

        h.makan();
        h.berjalan();
        h.bersuara();
        h.tampilkanNama();
        h.tampilkanUmur();

        input.close();
    }
}