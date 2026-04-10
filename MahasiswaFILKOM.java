package Inheritance;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(){}

    public MahasiswaFILKOM(String nama, boolean gender, String nik, boolean menikah, String nim, double ipk){
        super(nama, gender, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    public String getStatus(){
        String prodi = "";
        char kode = nim.charAt(6);

        switch (kode){
            case '2': prodi = "Teknik Informatika"; break;
            case '3': prodi = "Teknik Komputer"; break;
            case '4': prodi = "Sistem Informasi"; break;
            case '6': prodi = "Pendidikan Teknologi Informasi"; break;
            case '7': prodi = "Teknologi Informasi"; break;
        }

        String angkatan = "20" + nim.substring(0,2);

        return prodi + ", " + angkatan;
    }

    public double getBeasiswa(){
        if (ipk >= 3.5) return 75;
        else if (ipk >= 3.0) return 50;
        return 0;
    }

    public double getPendapatan(){
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
            String.format(
                "NIM           : %s\n" +
                "IPK           : %.2f\n" +
                "Status        : %s\n" +
                "Beasiswa      : $%.2f",
                nim, ipk, getStatus(), getBeasiswa()
            );
    }
}