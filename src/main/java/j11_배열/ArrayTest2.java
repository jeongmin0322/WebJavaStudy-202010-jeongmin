package j11_배열;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        학생을 입력받음
         */
        int cnt=0;
        String[] studentNames = new String[5];

        System.out.print("몇명의 학생을 등록하시겠습니까? ");
        cnt = scanner.nextInt();
        scanner.nextLine(); //getchar느낌

        studentNames = new String[cnt];

        for(int i=0; i< studentNames.length; i++){
            System.out.print(i+1+"번째 학생이름: ");
            studentNames[i] = scanner.nextLine();
        }

        for(int i=0; i< studentNames.length; i++){
            System.out.println((i+1)+". "+studentNames[i]);
        }
    }
}
