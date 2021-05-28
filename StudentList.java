package Ex9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> List = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    LocalDate localDate = LocalDate.now();
    int currentYear = localDate.getYear();

    public void addNewStudent() {
        Student student = new Student();
        System.out.printf("StudentID: ");
        student.setId(sc.next());
        System.out.printf("StudentName: ");
        student.setName(sc.next());
        System.out.printf("StudentTeleNumber: ");
        student.setNumber(sc.next());
        try {
            if (student.getNumber().equalsIgnoreCase("+855")) {}
        } catch (Exception e) {
            System.out.println("Input +855 again"+ e.getMessage());
            student.setNumber(sc.next());
        }
        System.out.printf("StudentDateOfBirth(Year-Month-Day): ");
        student.setDob(sc.nextInt());
        student.setMonth(sc.nextInt());
        student.setDay(sc.nextInt());
        try {
            if (currentYear - student.getDob() > 15) {

                try {
                    if (student.getMonth() > 12) {
                        try {
                            if (student.getDay() > 31) {}
                        }catch (Exception e) {
                            System.out.println("Day can not be bigger than 31" + e.getMessage());
                            student.setDay(sc.nextInt());
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Month can not be bigger than 12" + e.getMessage());
                    student.setMonth(sc.nextInt());
                }

                System.out.println("DOB Accepts!");
            }
        } catch (Exception e) {
            System.out.printf("Student is below 15 years old" + e.getMessage());
            student.setDob(sc.nextInt());
        }
        System.out.printf("StudentCity: ");
        student.setCity(sc.next());
        System.out.printf("StudentCountry: ");
        student.setCountry(sc.next());
        System.out.printf("StudentGroup: ");
        student.setGroup(sc.next());
        List.add(student);
    }

    public void ListStudent() {
        for (Student student: List) {
            System.out.println(student.toString());
        }
    }

    public void Menu() {
        System.out.printf("\t\tMenu\n" +
                "1.Add new student\n" +
                "2.Display list\n" +
                "3.Exit\n" +
                "Input options numbers: ");

    }
}
