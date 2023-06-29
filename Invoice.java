import java.util.ArrayList;

public class Invoice {
    private ArrayList<InvoiceLineItem> invoiceLine;

    public ArrayList<InvoiceLineItem> getInvoiceLine() {
        return invoiceLine;
    }

    public Invoice() {
        invoiceLine = new ArrayList<>();
    }

    public void addInvoiceLineItem(InvoiceLineItem line) {
        invoiceLine.add(line);
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < invoiceLine.size(); i++) {
            total += invoiceLine.get(i).getSubtotal();
        }
        return total;
    }
}
