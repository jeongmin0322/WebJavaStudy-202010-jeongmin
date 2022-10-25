package j07_반복;

public class Loop2 {
    public static void main(String[] args) {

        int result = 0;
        /*
        i가 0부터 100이 되기 전까지 i를 1씩 증가시키면서 반복해라
         */
        for (int i = 0; i < 100; i++){ //웬만하면 i=0으로 고정해서하기, 반복문은 건들지않기
            System.out.println(i+1);
        }
        System.out.println("1부터 100까지 더한 값: "+result);
    }
}
