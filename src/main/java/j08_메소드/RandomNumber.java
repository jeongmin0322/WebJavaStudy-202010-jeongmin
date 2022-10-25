package j08_메소드;

import java.util.Random;

public class RandomNumber {
    //함수는 클래스안에 작성함
    public static int calcRandom(int m){ //int 자료형 줌
        Random random = new Random();
        int result = random.nextInt(10) * 1000 +m ;
        return result;
    }

    public static void main(String[] args) {

        int money = 5000;
        calcRandom(money);

//        int a = random.nextInt(10)*1000+money;
//        System.out.println(a);
//        int b = random.nextInt(10)*1000+money;
//        System.out.println(b);
//        int c = random.nextInt(10)*1000+money;
//        System.out.println(c);
//        int d = random.nextInt(10)*1000+money;
//        System.out.println(d);

//        for(int i =0; i < 10; i++) {
//            int i1 = +10;
//            int randNum = random.nextInt(100)+100; //100부터 랜덤숫자 100개
//            System.out.println(randNum);
//        }

        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money);
        System.out.println(r+100);
    }
}
