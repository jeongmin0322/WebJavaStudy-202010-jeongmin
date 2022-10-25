package backjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner std = new Scanner(System.in);
        int N = 0;
        int su = 0;
        int cnt=0;

        N = std.nextInt();
        int[] num = new int[N];

        for(int i=0; i<N; i++){
            num[i] = std.nextInt();
        }

        su = std.nextInt();


        for(int i=0; i<num.length; i++){
            if(num[i] == su){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
