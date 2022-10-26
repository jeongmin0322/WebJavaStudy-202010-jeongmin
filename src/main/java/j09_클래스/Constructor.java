package j09_클래스;
//생성자 활용 방법
public class Constructor {

    int num; //전역변수
    String name;

    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int num){ //지역변수 ___ 우선순위 지역>전역
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
        //num = num; < 이건 그냥 자기자신한테.. 자기자신을 넣는거임;;
        this.num = num; // 생성자를 통한 값 주입
    }

    Constructor(String name){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");
        this.name = name;
    }

    Constructor(int num, String name){
        System.out.println("AIIArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    void showInfo(){
        System.out.println("num: "+num);
        System.out.println("name: "+name); // 여기서는 this 안써도됨 지역변수에 정의된게 없음 그래서 전역변수 써짐
    }
}
