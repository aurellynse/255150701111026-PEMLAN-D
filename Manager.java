package Inheritance;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean gender, String nik, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen){
        super(nama, gender, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() { return departemen; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + (getGaji() * 0.10);
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartemen    : " + departemen;
    }
}