package j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dan = 0;
        System.out.print("단 입력:");
        dan = scanner.nextInt();

        for (int i=0; i<9; i++){
            int num = 1 + i;
            System.out.println(dan+"*"+num+"="+(dan*num));
        }
    }
}