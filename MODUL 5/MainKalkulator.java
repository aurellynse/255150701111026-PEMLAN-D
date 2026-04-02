package PKalkulator;
public class MainKalkulator {
    public static void main(String[] args) {

        System.out.println("method static"); //ga perlu pakai objek
        Kalkulator.penjumlahan(10, 5);
        Kalkulator.pengurangan(20, 8);

        System.out.println();

        System.out.println("method non-static"); //harus buat objek
        Kalkulator kal = new Kalkulator(); 
        
        kal.perkalian(10, 5);
        kal.pembagian(100, 4);
        
        System.out.println();

        System.out.println("menyederhanakan pecahan");
        kal.Sederhana(12, 18);
        kal.Sederhana(10, 25);
    }
}
