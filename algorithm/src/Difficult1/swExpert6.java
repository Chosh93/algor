package Difficult1;

//하나의 자연수를 입력 받아 각 자릿수의 합을 계산하는 프로그램을 작성하라.
//[제약 사항]
//자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)
//[입력]
//입력으로 자연수 N이 주어진다.
//[출력]
//각 자릿수의 합을 출력한다.

import java.util.Scanner;

public class swExpert6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0 && num < 10000){
            int result = (num/1000 + ((num%1000)/100) + ((num%100)/10) + (num%10));
            System.out.println(result);
        }
    }
}
