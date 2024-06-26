package Difficult1;

import java.util.Scanner;

//10개의 수를 입력 받아, 평균값을 출력하는 프로그램을 작성하라.
//(소수점 첫째 자리에서 반올림한 정수를 출력한다.)
//[제약 사항]
//각 수는 0 이상 10000 이하의 정수이다.
//[입력]
//가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.
//[출력]
//출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
//(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
public class swExpert2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 케이스 수: ");
        int t = sc.nextInt();
        int[][] numArr = new int[t][10];

        for(int i = 0; i < t; i++) {
            System.out.println((i + 1) + "번째 테스트 케이스의 10개의 수를 입력하세요:");
            for (int j = 0; j < 10; j++) {
                int num = sc.nextInt();
                if (num < 0 || num > 10000) {
                    System.out.println("입력된 수는 0 이상 10000 이하여야 합니다.");
                    j--;
                }
                numArr[i][j] = num;
            }
        }

        for(int i = 0; i < t; i++){
            int result = 0;
            for(int j = 0; j < 10; j++){
                result += numArr[i][j];
            }
            System.out.println("#"+ t + " " + Math.round(result/10));
        }
    }
}
