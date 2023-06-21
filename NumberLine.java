import java.net.SocketTimeoutException;
import java.util.Scanner;

public class NumberLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ki tu dau tien");
        char firstChar = scanner.nextLine().charAt(0);
        System.out.println("Nhap ki tu cuoi cung");
        char lasttChar = scanner.nextLine().charAt(0);
        System.out.println("Nhap NumberLine =  ");
        int numberLine = scanner.nextInt();


        char currentChar = firstChar;
        int count = 0;
        while (currentChar != lasttChar) {
            System.out.print(currentChar + " ");
            count++;
            if (count % numberLine == 0) {
                System.out.println("");
            }
            currentChar++;
        }
        System.out.println(lasttChar);
    }
}
