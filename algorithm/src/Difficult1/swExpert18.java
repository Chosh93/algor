package Difficult1;

import java.util.Scanner;

public class swExpert18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 30){
            for (int i = 0; i <= num; i++) {
                int result = (int) Math.pow(2, i);
                System.out.print(result + " ");
            }
        }
    }
}
