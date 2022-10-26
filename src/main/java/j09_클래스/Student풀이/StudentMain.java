package j09_클래스.Student풀이;

public class StudentMain {
    public static void main(String[] args) {
        Student a1 = new Student();
        Student a2 = new Student();

        a1.schoolName = "부산대학교";
        a1.studentCode = 20220001;
        a1.studentYear = 1;
        a1.name = "김준일";

        a2.schoolName = "부산대학교";
        a2.studentCode = 20220002;
        a2.studentYear = 3;
        a2.name = "김준삼";

        a1.showStudentInfo();
        a2.showStudentInfo();


//        System.out.println("<<< 학년 증가 반복 >>>");
//        for(int i = 0; i < 10; i++) {
//            a2.increaseStudentYear();
//        }

        a2.showStudentInfo();

        a1.increaseStudentYear(2);
        a1.increaseStudentYear(2);
        a1.increaseStudentYear(2);
        a1.showStudentInfo();

        a2.increaseStudentYear(5);
    }
}
