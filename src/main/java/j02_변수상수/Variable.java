package j02_변수상수;


public class Variable {
    public static void main(String[] args) {

        // 논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);//sout 치면 프린터 자동완성
        checkFlag = true;
        System.out.println(checkFlag);

        //문자자료형 변수
        char name1 = '김';
        char name2 = '준';
        char name3 = '일';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(""+ name1 + name2 + name3); //큰따옴표 "" 안하면 유니코드 값들 더한걸로 나옴..,
        System.out.println('가'+0);

        //문자열자료형 변수
        String name = "김준일";
        String name4 = "윤도영";
        String name5 = name+name4;
        System.out.println(name5);

        // 정수자료형 변수
        int width1 = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width1+width2;
        String widthResult2 = width3+width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis(); //현재시간
        System.out.println(time);

        long time2 = 1666178898594L;
        System.out.println(time2);

        //실수자료형 변수
        double pi = 30000000.141592653599999999;
        System.out.println(pi);

        //상수
        final String FILE_PATH = "C:/Users/junil"; //파일 경로 지정
        //변수와 상수의 차이는.. 상수는 한번 값을 넣으면 바꿀 수가 없다.!!
        //final을 빼면 일반 상수가 됨..
//        FILE_PATH = "D:/Users/junil";

        System.out.println(FILE_PATH); //상수는 전부 다 대문자로 써라..라는 이야기


    }
}
