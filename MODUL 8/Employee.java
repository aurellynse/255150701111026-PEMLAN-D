package Interface3;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    // total hutang belanja
    public double getTotalInvoice() {
        double total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    // gaji setelah dipotong
    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }

    public void tampilkanData() {
        System.out.println("========= DATA KARYAWAN =========");
        System.out.println("ID        : " + registrationNumber);
        System.out.println("Nama      : " + name);
        System.out.printf("Gaji Awal : Rp%,d\n", salaryPerMonth);

        System.out.println("\n-------- Detail Belanja ---------");
        for (Invoice inv : invoices) {
            System.out.println(inv); // polymorphism
        }

        System.out.println("---------- Detail Gaji ----------");
        System.out.printf("Total Hutang        : Rp%,.0f\n", getTotalInvoice());
        System.out.printf("Gaji Setelah Potong : Rp%,.0f\n", getPayableAmount());
        System.out.println("=================================");
    }
}