package j05_Scanner;

import java.util.Scanner; //스캐너 쓰려면 얘... 입력해야됨..;;

public class Input1 {
    public static void main(String[] args) {

        /**
         * 문자열 입력.
         * next()       -> 띄어쓰기 포함X
         * nextLine()   -> 띄어쓰기 포함O
         */

        String name = "김준일";

        Scanner scanner = new Scanner(System.in); //자료형이 Scanner!!! 이렇게 넣어놔야만 입력할수있음, 얘는 선언 1번만함

        String s = scanner.nextLine(); //사용자의 입력을 기다림
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        //nextLine

        System.out.println("입력 받은 값1: "+s);
        System.out.println("입력 받은 값2: "+s2);
        System.out.println("입력 받은 값3: "+s3);
    }
}

