import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] array = new int[3][3];


//         Gan gia tri trong mang
        ganGt(array, scanner);
//         In gia tri
        System.out.println("cac gia tri trong mang:");
        inGT(array);
//        Tim gia tri lon nhat dong 2
        int maxvalue = maxRow(array, 1 );
        System.out.println("Gia tri lon nhat dong 2 la: "+ maxvalue);
//        Tong gia tri cua tat ca
        int totaValue = totalArray(array);
        System.out.println("Tong gia tri cua toan bo mang la: " + totaValue);
    }
    public static void ganGt(int[][] array, Scanner scanner) {
        int row = array.length;
        int col = array[0].length;
        for (int i=0; i< row;i++){
            for (int j= 0; j< col; j++){
                System.out.println("Nhap gia tri cho phan tu [" + i + "] [" + j +"]");
                int value = scanner.nextInt();
                array[i][j] = value;
            }
            System.out.println();

        }
    }
    public static void inGT (int [][] array) {
        int row = array.length;
        int col = array[0].length;
        for (int i=0; i<row; i++) {
            for (int j=0 ; j<col ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int maxRow (int[][] array, int row) {
        int max = 0 ;
        int col = array[0].length;
        for (int i =0; i< col ; i++) {
            if (array[row][i] > max) {
                max = array[row][i];
            }
        }
        return max;


    }
    public static  int totalArray (int[][] array ) {
        int total = 0;
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j< col; j++){
                total += array[i][j];
            }
        }return total;
    }
}
