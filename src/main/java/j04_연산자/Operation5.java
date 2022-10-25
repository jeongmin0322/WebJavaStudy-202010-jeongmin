package j04_연산자;
//page 인덱스 구하기

public class Operation5 { //클래스이름과.. String(문자열)은 항상 대문자로 시작.. String이 클래스임
    public static void main(String[] args) {

        int totalCount = 202;
        int maxPage = totalCount % 10==0 ? totalCount / 10 : totalCount / 10 + 1;

        int page = 15;

        int startIndex = page % 5 == 0 ? page - 4 : page - (page % 5) + 1;
        int endIndex = startIndex + 4 <= maxPage ? startIndex + 4 : maxPage;

        System.out.println("page: "+page);
        System.out.println("startIndex: "+ startIndex);
        System.out.println("endIndex: "+ endIndex);

        String isMaxIndexStr = page == endIndex ? "마지막 인덱스 입니다." : "마지막 인덱스가 아닙니다.";
        System.out.println(isMaxIndexStr);
    }
}
