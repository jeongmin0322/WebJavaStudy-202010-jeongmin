package j09_클래스.Student풀이;

public class Student {
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear(){
        if(studentYear == 5){
            System.out.println("-----현재 학년은 최대학년입니다.-----\n");
            return;
        }
        else{
            studentYear++;
        }
        showStudentInfo();
    }

    void increaseStudentYear(int year){
        studentYear = studentYear + year;
        if(studentYear > 5){
            System.out.println(year+"학년을 더하면 "+studentYear+"학년이 되어서 넘어섭니다.\n");
            studentYear = studentYear - year;
            return;
        }
        showStudentInfo();
    }

    void showStudentInfo(){
        System.out.println("학교: "+schoolName+"\n"+"학번: "+studentCode+"\n"+"학년: "+studentYear+"\n"+"이름: "+name+"\n");
    }
}
