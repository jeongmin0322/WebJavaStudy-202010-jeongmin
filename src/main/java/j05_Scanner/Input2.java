package j05_Scanner;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //이게 있어야만 입력O

        //int num1 = scanner.nextInt(); //int를 입력받음

        System.out.print("x입력: ");
        int x = scanner.nextInt();
        System.out.print("y입력: ");
        int y = scanner.nextInt();

        System.out.println("x + y = "+(x+y)); //괄호묶어줘야 10,20입력했을때 30나옴 아니면 1020
    }
}
