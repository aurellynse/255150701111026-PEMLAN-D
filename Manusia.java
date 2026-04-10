package Inheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true = L, false = P
    private String nik;
    private boolean menikah;

    public Manusia(){}

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // getter setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public boolean getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(boolean jenisKelamin) { this.jenisKelamin = jenisKelamin; }

    public String getNik() { return nik; }
    public void setNik(String nik) { this.nik = nik; }

    public boolean getMenikah() { return menikah; }
    public void setMenikah(boolean menikah) { this.menikah = menikah; }

    public double getTunjangan(){
        if (menikah){
            return jenisKelamin ? 25 : 20;
        }
        return 15;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString(){
        return String.format(
            "\nNama          : %s\n" +
            "NIK           : %s\n" +
            "Jenis Kelamin : %s\n" +
            "Pendapatan    : $%.2f",
            nama, nik, jenisKelamin ? "Laki-laki" : "Perempuan", getPendapatan()
        );
    }
}