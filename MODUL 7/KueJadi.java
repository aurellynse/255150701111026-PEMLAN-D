package PPolymorphism;

public class KueJadi extends Kue {
    private int jumlah;

    public KueJadi(String nama, double harga, int jumlah){ //constructor
        super(nama, harga); //the extended stuffs
        this.jumlah = jumlah;
    }

    public int getJumlah(){
        return jumlah;
    }

    @Override
    public double hitungHarga(){
        return harga * jumlah * 2; //its own version of hitungHarga
    }

    @Override
    public String toString(){
        return String.format (super.toString() + 
               "Jenis: Kue Jadi    | Jumlah: %-3d| Harga Akhir: $%.2f", jumlah, hitungHarga());

    }
}