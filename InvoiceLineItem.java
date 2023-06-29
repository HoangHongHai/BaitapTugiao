public class InvoiceLineItem {
    private Item item;
    private int quantity;

    public InvoiceLineItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getSubtotal() {
        return item.getPrice() * quantity;
    }
}
