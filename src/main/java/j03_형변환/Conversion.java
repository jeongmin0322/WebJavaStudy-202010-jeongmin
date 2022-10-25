package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        //upcasting(업캐스팅) - 묵시적형변환
        char cast1 = 'a';
        System.out.println((int)cast1);
        int cast2 = (int)cast1; //cast1라고 적어도 자동으로 바뀜 당연함.
        System.out.println(cast2);


        //downcasting(다운캐스팅) - 명시적형변환
        int cast3 = 98;
        //char cast4 = cast3; 이건안됨
        char cast4 = (char)cast3; //이건됨
        System.out.println(cast4);

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6);
        double cast7 = cast6;
        System.out.println(cast7); //3.14가 아닌 3.0 출력
    }
}
