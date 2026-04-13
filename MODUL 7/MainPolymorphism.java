package PPolymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {

        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Lapis Legit", 50, 1.5);
        kueArray[1] = new KueJadi("Donat", 5, 10);
        kueArray[2] = new KuePesanan("Brownies", 40, 2);
        kueArray[3] = new KueJadi("Klepon", 3, 15);
        kueArray[4] = new KuePesanan("Cheesecake", 60, 1);
        kueArray[5] = new KueJadi("Onde-onde", 4, 12);
        kueArray[6] = new KuePesanan("Tiramisu", 55, 1.2);
        kueArray[7] = new KueJadi("Nastar", 6, 20);
        kueArray[8] = new KuePesanan("Red Velvet", 50, 1.3);
        kueArray[9] = new KueJadi("Putri Salju", 7, 18);
        kueArray[10] = new KuePesanan("Black Forest", 65, 2);
        kueArray[11] = new KueJadi("Kastengel", 8, 25);
        kueArray[12] = new KuePesanan("Opera Cake", 70, 1);
        kueArray[13] = new KueJadi("Martabak Mini", 5, 14);
        kueArray[14] = new KuePesanan("Chiffon Cake", 45, 1.5);
        kueArray[15] = new KueJadi("Lemper", 4, 16);
        kueArray[16] = new KuePesanan("Pound Cake", 48, 1.7);
        kueArray[17] = new KueJadi("Risoles", 3, 22);
        kueArray[18] = new KuePesanan("Carrot Cake", 52, 1.4);
        kueArray[19] = new KueJadi("Pastel", 4, 19);

        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = kueArray[0];

        for (Kue k : kueArray) {
            System.out.println(k);

            double harga = k.hitungHarga();
            totalHarga += harga;

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += harga;
                totalBerat += kp.getBerat();
            } else if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalHargaJadi += harga;
                totalJumlah += kj.getJumlah();
            }

            if (harga > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("\nTotal Harga Semua Kue: $" + totalHarga);
        System.out.println("Total Harga KuePesanan: $" + totalHargaPesanan);
        System.out.println("Total Berat KuePesanan: " + totalBerat);
        System.out.println("Total Harga KueJadi: $" + totalHargaJadi);
        System.out.println("Total Jumlah KueJadi: " + totalJumlah);

        System.out.println("\nKue Termahal:");
        System.out.println(kueTermahal);
    }
}