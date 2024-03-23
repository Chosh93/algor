package Difficult1;

import java.util.Scanner;

// 연월일 순으로 구성된 8자리의 날짜가 입력으로 주어진다.
//해당 날짜의 유효성을 판단한 후, 날짜가 유효하다면
//[그림1] 과 같이 ”YYYY/MM/DD”형식으로 출력하고,
//날짜가 유효하지 않을 경우, -1 을 출력하는 프로그램을 작성하라.
//연월일로 구성된 입력에서 월은 1~12 사이 값을 가져야 하며
//일은 [표1] 과 같이, 1일 ~ 각각의 달에 해당하는 날짜까지의 값을 가질 수 있다.
//※ 2월의 경우, 28일인 경우만 고려한다. (윤년은 고려하지 않는다.)
//[입력]
//입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
//다음 줄부터 각 테스트 케이스가 주어진다.
//[출력]
//테스트 케이스 t에 대한 결과는 “#t”을 찍고, 한 칸 띄고, 정답을 출력한다.
//(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
//입력                   출력
//5                     #1 2222/02/28
//22220228              #2 -1
//20150002              #3 0101/01/01
//01010101              #4 -1
//20140230              #5 1111/11/11
//11111111
public class swExpert7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String date = sc.next();
            String year = date.substring(0, 4);
            String month = date.substring(4, 6);
            String day = date.substring(6);

            if(isMonthDay(month, day)){
                System.out.println(year + "/" + month + "/" + day);
            } else {
                System.out.println("-1");
            }
        }
    }

    public static boolean isMonthDay(String month, String day){
        int[] dayArr = {31, 28, 31, 30 , 31, 30, 31, 31, 30, 31, 30, 31};
        if(Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12){
            return false;
        }
        if(Integer.parseInt(day) > dayArr[Integer.parseInt(month) - 1]){
            return false;
        }
        return true;
    }
}
