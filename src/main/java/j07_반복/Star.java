package j07_반복;

public class Star {
    public static void main(String[] args) {


        // ▶ 모양 찍기
        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i=0; i<10; i++){
            for(int j=0; j<10-i; j++){

                System.out.print("*");
            }
            System.out.println(); //등호 웬만해서 바꾸지말고.. -- 쓰지말고.. 되도록하기,,
        }
        System.out.println();

        // ◀ 모양 찍기
        for(int i=0; i<10; i++){
            for(int j=0; j<10-i - 1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<0+i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<10-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
