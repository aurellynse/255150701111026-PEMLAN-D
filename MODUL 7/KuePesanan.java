package PPolymorphism;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat(){
        return berat;
    }

    @Override
    public double hitungHarga(){
        return harga * berat; //its own version again
    }

    @Override
    public String toString(){
        return String.format (super.toString() + 
               "Jenis: Kue Pesanan | Berat: %-3.1f | Harga Akhir: $%.2f", berat, hitungHarga());
    }
}