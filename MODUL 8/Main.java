package Interface3;

public class Main {
    public static void main(String[] args) {

        // data belanja
        Invoice i1 = new Invoice("Beras", 2, 50000);
        Invoice i2 = new Invoice("Minyak", 1, 30000);
        Invoice i3 = new Invoice("Gula", 3, 15000);

        Invoice[] invoices = {i1, i2, i3};

        // data karyawan
        Employee emp = new Employee(101, "K", 3000000, invoices);

        // tampilkan
        emp.tampilkanData();
    }
}