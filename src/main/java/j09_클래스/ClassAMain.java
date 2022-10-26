package j09_클래스;
//클래스 = 틀, 객체 = 반죽, 인스턴스 = 붕어빵

/**
 * ClassName: Student

 * Properties(속성) - (맴버)변수
 * schoolName -String
 * studentCode -int
 * studentYear -int
 * name

 * Function(기능) - (맴버)메소드
 * increaseStudentYear() - 호출시에 현재 학년을 1학년 증가
 * showStudentInfo() - 학생 정보 출력
 *
 * showStudentInfo 출력예시)
 * 부산대학교
 * 202220001
 * 2
 * 김준일
 * increaseStudentYear() 하면
 * 부산대학교
 * 202220001
 * 3
 * 김준일
 **/


public class ClassAMain {
    public static void main(String[] args) {

        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        ClassA a1 = new ClassA(); //ClassA가 자료형
        ClassA a2 = new ClassA();

        a1.name = "김준일";

        System.out.println(a1.name);

        a2.name = "김준이";

        System.out.println(a2.name);

        //System.out.println(a1.callName()); 이건 안됨.. 반환하는게없음

        a1.callName();
        a2.callName();
    }
}
