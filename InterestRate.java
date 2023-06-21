import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien muon gui");
        double money = scanner.nextDouble();
        System.out.println("Nhap so thang muon lay lai");
        int month = scanner.nextInt();

        double rateMonth = 0.00417;

        double totalMoney = money + money*rateMonth;
        for (int i =1; i< month; i++) {
            totalMoney += money;

            totalMoney*=(1 + rateMonth);

        }
        System.out.println("So tien ban nhan duoc la :  " + totalMoney);

    }
}
