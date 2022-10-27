package j11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students; //학생들을 저장할 수 있는 배열

    public StudentRepository(Student[] students) {
        students = new Student[0];
    }

    public void addStudent(Student student)  {
        int index = indexOfEmpty();

        if(index == -1){
             index = increaseArray();
         }

        students[index] = student;
    }

    //배열공간확인, n번째 공간 비었다 이런거..
    private int indexOfEmpty(){
        for(int i=0; i< students.length; i++){
            if(students[i] == null){
                return i;
            }
        }

        return -1;
    }

    private int increaseArray(){ //공간 하나를 늘리기~~
        Student[] tempArray = new Student[students.length+1];
        for(int i=0; i< students.length; i++){
            tempArray[i] = students[i];
        }
        students = tempArray;

        return tempArray.length-1; //비어있는 인덱스 번호를 가리킴
    }
}
