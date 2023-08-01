package Bai3;

import java.util.Date;
import java.util.Scanner;

public class testBai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        String x = scanner.nextLine();
       ;


        Visit muaLan1 = new Visit(x, new Date());
        Customer customerHai = muaLan1.getCustomer();
        System.out.println("Nhap the thanh vien:");
        String y = scanner.nextLine();
        customerHai.setMemberType(y);
        customerHai.isMember();

        muaLan1.setProductExpense(100);
        muaLan1.setServiceExpense(80);
        System.out.println("Tong so tien khach phai tra: " + muaLan1.getTotalExpense());
    }
}
