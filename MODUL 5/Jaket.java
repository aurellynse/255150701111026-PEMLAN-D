package PJaket;

public class Jaket {
    private final int HARGA_A = 100000;
    private final int HARGA_B = 125000;
    private final int HARGA_C = 175000;

    public void cekHarga(String tipe, int jumlah) {
        int hargaSatuan;

        if (tipe.equalsIgnoreCase("A")) {
            hargaSatuan = (jumlah > 100) ? 95000 : HARGA_A;
        } else if (tipe.equalsIgnoreCase("B")) {
            hargaSatuan = (jumlah > 100) ? 120000 : HARGA_B;
        } else if (tipe.equalsIgnoreCase("C")) {
            hargaSatuan = (jumlah > 100) ? 160000 : HARGA_C;
        } else {
            System.out.println("Tipe jaket salah!");
            return;
        }

        long total = (long) hargaSatuan * jumlah;
        System.out.println("Pesanan Jaket " + tipe.toUpperCase());
        System.out.println("Harga Satuan : Rp " + hargaSatuan);
        System.out.println("Total Bayar  : Rp " + total);
        System.out.println("---------------------------");
    }
}