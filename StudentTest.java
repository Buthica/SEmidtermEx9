package Ex9;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        while (true) {
            list.Menu();
            int i = sc.nextInt();

            if (i == 1) {
                list.addNewStudent();
            } else if (i == 2) {
                list.ListStudent();
            } else if (i == 3) {
                break;
            } else {
                System.out.println("Input again!");
            }
        }
    }
}
