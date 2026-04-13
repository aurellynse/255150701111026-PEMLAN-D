package PPolymorphism;

public abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga){ //constructor
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga(); //THE abstract method. this forces each subclass to have their own definition of hitungHarga()

    @Override
    public String toString(){
        return String.format ("Nama: %-13s | Harga: $%-2.0f | ", nama, harga);
    }
}
