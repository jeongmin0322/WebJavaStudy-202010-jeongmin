package j07_반복;

public class Loop5 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++){
            for(int j=0; j<9; j++){
                System.out.println((i+2)+"*"+(j+1)+"="+(i+2)*(j+1));
            }
        }
    }
}