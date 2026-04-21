package Interface3;

public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
    return String.format(
        "%-30s x%-3d\nPrice: Rp%,d %17s\n",
        productName,
        quantity,
        pricePerItem,
        "Rp" + String.format("%,.0f", getPayableAmount())
    );
    
    }
}