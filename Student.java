import java.util.Scanner;
import java.util.Arrays;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong hoc sinh:  ");
        int totalStudent = scanner.nextInt();

        String[] studentName = new String[totalStudent];
        int[] studentGrades = new int[totalStudent];

        for (int i = 0; i< totalStudent; i++) {
            scanner.nextLine();
            System.out.print("Nhap ten hoc sinh: ");
           studentName[i] = scanner.nextLine();

            System.out.print("Nhap diem hoc sinh: ");
            studentGrades[i] = scanner.nextInt();
        }
        System.out.println("Danh sach sinh vien sap xep theo diem: ");
        sortStudent(studentName,studentGrades);
        for (int i=0; i< totalStudent;i++) {
            System.out.println(studentName[i] + "-" + studentGrades[i]);
             }
        System.out.println("Xep hang:  ");
        for (int i=0; i< totalStudent;i++) {
            char ranking = getRank(studentGrades[i]);
            System.out.println(studentName[i] + "-" + ranking);
        }

    }
    public static void sortStudent (String[] names, int[] grades) {
        for (int i=0 ; i< grades.length -1; i++ ) {
            for (int j= i+1; j< grades.length - 1 ; j++){
                if (grades[i] < grades[j]) {
                    int tempGrades = grades[i];
                    grades[i] = grades[j];
                    grades[j] = tempGrades;

                    String tempNames = names[i];
                    names[i] = names[j];
                    names[j] = tempNames;
                }
            }
        }
    }
    public static char getRank(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 65) {
           return 'D';
        } else return 'F';

    }

}
