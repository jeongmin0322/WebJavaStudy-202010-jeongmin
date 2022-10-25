package j08_메소드;

import java.util.Scanner;

public class Method2 {
    /**
     * Q.문제 - 별찍기
     * main에서 입력을 받음
     */

    public static String getStar(int select, int num) {
        String result = "";

        if (select == 1) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result = result + "*";

                }
                result = result + "\n";
            }
            result = result + "\n";

        } else if (select == 2) {
            for(int i=0; i<num; i++){
                for(int j=0; j<i; j++){
                    result = result + " ";
                }
                for(int j=0; j<num-i; j++){
                    result = result + "*";
                }
                result = result + "\n";
            }

        } else if (select == 3) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i; j++) {
                    result = result + "*";
                }
                result = result + "\n";
            }
            result = result + "\n";
        } else if (select == 4) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i; j++) {
                    result = result + " ";
                }
                for (int j = 0; j < num - i; j++) {
                    result = result + "*";
                }
                result = result + "\n";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        //입력
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int select = 0;

        System.out.print("별의 개수 입력: ");
        n = scanner.nextInt();

        System.out.println("1. 왼쪽에 치우친 증가하는 별");
        System.out.println("2. 오른쪽에 치우친 증가하는 별");
        System.out.println("3. 왼쪽에 치우친 감소하는 별");
        System.out.println("4. 오른쪽에 치우친 감소하는 별");

        System.out.print("메뉴 선택: ");
        select = scanner.nextInt();


        String star = getStar(select, n);
        System.out.println("[ 결과 ]");
        System.out.println(star);

    }
}
