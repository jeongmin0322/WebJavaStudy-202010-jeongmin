package j08_메소드;

public class Method1 {

    // 1. [x | x] 입력(매개변수), 출력(반환)
    public static void call1(){ //반환이 없는 건 void라고 씀
        System.out.println("[x | x]");
    }

    // 2. [o | x] < 입력은 있는데 출력은 없다는 뜻
    public static void call2(String str){ //입력이 있다는 건.. call2()안에 무언가가 있어야됨
        System.out.println("[o | x]");
        System.out.println("수업과목: "+str);
    }

    //3. [x | o]
    public static String call3(){
        String result = "";
        System.out.println("[x | o]");
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                result = result + "*";
            }
            result = result + "\n";
        }
        return result;
    }

    //4. [o | o]
    public static String call4(int year, int month, int day) {
        System.out.println("[o | o]");
        return year+"년 "+month+"월 "+day+"일 ";
    }

    //main 메소드
    public static void main(String[] args) {
        call1(); //call1 호출
        call2("java");
        String star1 = call3();
        System.out.println(star1);
        String date = call4(2022,10,24);
        System.out.println(date);
    }
}
