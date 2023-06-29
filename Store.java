import java.util.ArrayList;
import java.util.Scanner;

public  class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhap so luong mat hang");
        int totalItem = scanner.nextInt();
        System.out.println("Nhap don hang");
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < totalItem; i++) {
            System.out.println("Mat hang #" + (i + 1));
            System.out.println("Ten:  ");
            String name = scanner.next();
            scanner.nextLine();
            System.out.println("Don gia: ");
            double price = scanner.nextDouble();

            Item item = new Item(name, price);
            items.add(item);

        }
//        in danh sach mat hang trong kho
        System.out.println("In danh sach cac mat hang trong kho");
        for (Item item : items) {
            System.out.println("Ten mat hang:" + item.getName());
            System.out.println("Don gia: " + item.getPrice());
            System.out.println();

        }
//        Nhap don hang
        Invoice invoice = new Invoice();

        System.out.println("So luong dong hoa don");
        int lineItemCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < lineItemCount; i++) {
            System.out.println("dong hoa don #" + (i + 1));
            System.out.println("Ten mat hang can mua: ");
            String itemName = scanner.nextLine();
            System.out.println("So luong mat hang: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            Item selectedItem = null;
            for (Item item : items) {
                if (item.getName().equals(itemName)) {
                    selectedItem = item;
                    break;
                }
            }
            if (selectedItem != null) {
                InvoiceLineItem lineItem = new InvoiceLineItem(selectedItem, quantity);
                invoice.addInvoiceLineItem(lineItem);
            } else {
                System.out.println(" Mat hang khong co trong kho");
            }

        }

//        In hoa don
        System.out.println("In hoa don thanh toan");
        for (InvoiceLineItem lineItem : invoice.getInvoiceLine()) {
            System.out.println("Ten mat hang: " + lineItem.getItem().getName());
            System.out.println("So luong: " + lineItem.getQuantity());
            System.out.println("Thanh tien: " + lineItem.getSubtotal());
            System.out.println();
        }
        System.out.println(" Tong so tien phai thanh toan là: " + invoice.getTotal());

    }
}



