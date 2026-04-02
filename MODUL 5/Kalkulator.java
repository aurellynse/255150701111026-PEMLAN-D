package PKalkulator;
public class Kalkulator {

    public static void penjumlahan(int a, int b) {
        System.out.println("hasil penjumlahan: " + (a + b));
    }

    public static void pengurangan(int a, int b) {
        System.out.println("hasil pengurangan: " + (a - b));
    }

    public void perkalian(int a, int b) {
        System.out.println("hasil perkalian: " + (a * b));
    }
    public void pembagian(double a, double b) {
        System.out.println("hasil pembagian: " + (a / b));
    }

    public void Sederhana(int pembilang, int penyebut) {
        int a = pembilang;
        int b = penyebut;
        int temp;

        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        int fpb = a; 
        System.out.println("pecahan sederhana: " + (pembilang / fpb) + "/" + (penyebut / fpb));
    }
} 
