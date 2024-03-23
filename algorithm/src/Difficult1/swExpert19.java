package Difficult1;

//주어진 숫자부터 0까지 순서대로 찍어보세요

import java.util.Scanner;

public class swExpert19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}
