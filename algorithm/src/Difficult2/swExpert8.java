package Difficult2;

import java.util.Arrays;
import java.util.Scanner;

//학기가 끝나고, 학생들의 점수로 학점을 계산중이다.
//학점은 상대평가로 주어지는데, 총 10개의 평점이 있다.
//학점은 학생들이 응시한 중간/기말고사 점수 결과 및 과제 점수가 반영한다.
//각각 아래 비율로 반영된다.
//10 개의 평점을 총점이 높은 순서대로 부여하는데,
// A+, A0, A-, B+, B0, B-, C+, C0, C-, D+, D0
//각각의 평점은 같은 비율로 부여할 수 있다.
//예를 들어, N 명의 학생이 있을 경우 N/10 명의 학생들에게 동일한 평점을 부여할 수 있다.
//입력으로 각각의 학생들의 중간, 기말, 과제 점수가 주어지고,
//학점을 알고싶은 K 번째 학생의 번호가 주어졌을 때,
//K 번째 학생의 학점을 출력하는 프로그램을 작성하라.
//[제약사항]
//1. N은 항상 10의 배수이며, 10이상 100이하의 정수이다. (10 ≤ N ≤ 100)
//2. K는 1 이상 N 이하의 정수이다. (1 ≤ K ≤ N)
//3. K 번째 학생의 총점과 다른 학생의 총점이 동일한 경우는 입력으로 주어지지 않는다.
//[입력]
//입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
//다음 줄부터 각 테스트 케이스가 주어진다.
//테스트 케이스의 첫 번째 줄은 학생수 N 과, 학점을 알고싶은 학생의 번호 K 가 주어진다.
//테스트 케이스 두 번째 줄 부터 각각의 학생이 받은 시험 및 과제 점수가 주어진다.
//[출력]
//테스트 케이스 t에 대한 결과는 “#t”을 찍고, 한 칸 띄고, 정답을 출력한다.
//(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
public class swExpert8 {
    public static void main(String[] args) {
        String[] score = {"D0", "D+", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int totalStu = sc.nextInt();
            int selStu = sc.nextInt();
            if(totalStu >= 10 && totalStu <= 100 && selStu >= 1 && selStu <= totalStu){
                double[][] st_score = new double[totalStu][3];
                double[] calc_score = new double[totalStu];
                double[] total_cal = new double[totalStu];
                int[] grade = new int[totalStu];
                for(int j = 0; j < totalStu; j++){
                    for(int k = 0; k < 3; k++){
                        st_score[j][k] = sc.nextInt();
                    }
                }
                for(int j = 0; j < totalStu; j++){
                    calc_score[j] = st_score[j][0]*0.35 + st_score[j][1]*0.45 + st_score[j][2]*0.2;
                    total_cal[j] = st_score[j][0]*0.35 + st_score[j][1]*0.45 + st_score[j][2]*0.2;
                }
                Arrays.sort(calc_score);
                for(int j = 0; j < calc_score.length; j++){
                    for(int k = 0; k < total_cal.length; k++){
                        if(total_cal[j] == calc_score[k]){
                            grade[j] = k+1;
                        }
                    }
                }
                System.out.println("#"+ (i+1) + " " +score[grade[selStu-1]]);
            }
        }
    }
}
