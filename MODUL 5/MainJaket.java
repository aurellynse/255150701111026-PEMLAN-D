package PJaket;

public class MainJaket {
    public static void main(String[] args) {
        Jaket order = new Jaket();

        System.out.println("---------------------------");
        order.cekHarga("A", 101); // 95rb
        order.cekHarga("B", 50);  // normal 125rb
        order.cekHarga("C", 150); // 160rb
    }
}
