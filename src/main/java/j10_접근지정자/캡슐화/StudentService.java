package j10_접근지정자.캡슐화;

public class StudentService {

    public void registerStudent(){
        System.out.println(" [학생 정보 등록 메뉴 ]");
        System.out.println("먼저 학생의 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김준일");
        System.out.println("학생정보를 등록합니다.");
    }


    //어차피 여기서밖에 메소드 안쓰니까 private로 써줌 public이 아니라
    // ---> 독립적으로 안쓰이고 순차적으로 로직대로가야 쓸 수 있음 (편법이 안된다는 말)
    // 나중에 라이브러리 쓸텐데 거기서 여러개 엄청 나오면 헷갈려서 private로 써주는거임
    private boolean doubleCheckStudent(String studentName){
        if(studentName.equals("김준일")){ //문자열이 서로 같은지 비교 할 때, == 랑 비슷
            return false;
        }

        return true;
    }
}
