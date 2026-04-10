package Inheritance;

import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(){}

    public Pekerja(String nama, boolean gender, String nik, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak){
        super(nama, gender, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }

    public int getJumlahAnak() { return jumlahAnak; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    public LocalDate getTahunMasuk() { return tahunMasuk; }

    public double getBonus(){
        int lamaKerja = Period.between(tahunMasuk, LocalDate.now()).getYears();

        if (lamaKerja <= 5) return gaji * 0.05;
        else if (lamaKerja <= 10) return gaji * 0.10;
        else return gaji * 0.15;
    }

    public double getPendapatan(){
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
            String.format(
                "Tahun Masuk   : %s\n" +
                "Jumlah Anak   : %d\n" +
                "Gaji          : $%.2f",
                tahunMasuk, jumlahAnak, gaji
            );
    }
}