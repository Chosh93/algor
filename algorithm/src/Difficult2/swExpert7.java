package Difficult2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//10개의 수를 입력 받아, 최대 수와 최소 수를 제외한 나머지의 평균값을 출력하는 프로그램을 작성하라.
//(소수점 첫째 자리에서 반올림한 정수를 출력한다.)
//[제약 사항]
//각 수는 0 이상 10000 이하의 정수이다.
//[입력]
//가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.
//[출력]
//출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
//(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
public class swExpert7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            List<Integer> numList = new ArrayList<>();
            int sum = 0;
            for(int j = 0; j < 10; j++){
                int num = sc.nextInt();
                if(num >= 0 && num <= 10000){
                    numList.add(num);
                }
            }
            int min = numList.get(0);
            int max = numList.get(0);

            for(int j = 0; j < numList.size(); j++){
                if(numList.get(j) < min){
                    min = numList.get(j);
                }
                if(numList.get(j) > max){
                    max = numList.get(j);
                }
            }

            numList.removeAll(Arrays.asList(min));
            numList.removeAll(Arrays.asList(max));

            for(int j = 0; j < numList.size(); j++){
                sum += numList.get(j);
            }
            System.out.println("#"+ (i+1) + " " +  Math.round((double)(sum)/numList.size()));
        }
    }
}
