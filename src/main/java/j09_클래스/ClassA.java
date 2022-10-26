package j09_클래스;

public class ClassA {

    int num;
    String name;
    double score;

    // 생성자
    ClassA(){

    }

    ClassA(int a){ //반환자료형이 없음, 대문자로 시작가능, 클래스명이랑 일치해야함
        //항상 주소값이 반환됨. 그래서 반환자료형 없어도 되는거.. 생략되니까
        //오버로딩된 생성자가 하나라도 있으면 기본 생성자는 없어짐
        System.out.println("a: "+a);
        System.out.println("ClassA를 생성합니다.");
    }


    void callName(){
        System.out.println(name+"을(를) 부릅니다.");
    }

}
