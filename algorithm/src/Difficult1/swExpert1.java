package Difficult1;

import java.util.Scanner;

//10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력하는 프로그램을 작성하라.
//[제약 사항]
//각 수는 0 이상 10000 이하의 정수이다.
//[입력]
//가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.
public class swExpert1 {
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

        for(int i = 0; i < t; i++) {
            int result = 0;
            for (int j = 0; j < 10; j++) {
                if (numArr[i][j] % 2 == 1) { // 홀수인 경우에만 더하기
                    result += numArr[i][j];
                }
            }
            System.out.println("#" + (i + 1) + " " + result);
        }
    }
}
