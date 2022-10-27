package j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentService {
    private Scanner scanner;

    public void StudentService(Scanner scanner) {
        this.scanner = scanner;

    }

    public void registerStudent() {

        String name;
        int kor;
        int eng;
        int math;

        System.out.println("[학생정보 등록");
        System.out.println("이름: ");
        name =scanner.nextLine();
        System.out.println("국어: ");
        kor = scanner.nextInt();
        System.out.println("영어: ");
        eng = scanner.nextInt();
        System.out.println("수학: ");
        math = scanner.nextInt();

        Student student = new Student(name,kor,eng,math);
    }

}
