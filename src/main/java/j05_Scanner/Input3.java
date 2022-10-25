package j05_Scanner;

import java.util.Scanner;
/*
 * Q. 문제
 * 이름: 김준일              name
 * 나이: 29                 age
 * 주소: 부산 동래구 사직동    address
 * 연락처: 010 9988 1916    phone
 *
 * 출력>
 * 사용자의 이름은 김주일이고 나이는 29입니다.
 * 주소는 부산 동래구 사직동이며 연락처는 010 9988 1916 입니다.
 */

public class Input3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next(); //next()는 스페이스바,엔터를 문자로 인식안함

        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine(); // 버퍼에 남아있는 엔터를 날려줌

        System.out.print("주소: ");
        address = scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine(); //nextLine()은 스페이스바,엔터를 문자로 인식함

        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age+"입니다.\n주소는 "+address+"연락처는 "+phone+"입니다.");

//        System.out.print("이름: ");
//        String name = scanner.next();
//
//        System.out.print("나이: ");
//        int age = scanner.nextInt();
//
//        System.out.println("주소: ");
//        String address = scanner.nextLine();
//
//        System.out.print("연락처: ");
//        String phone = scanner.nextLine();
//
//        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age+"입니다.\n주소는 "+address+"연락처는 "+phone+"입니다.");
    }
}
