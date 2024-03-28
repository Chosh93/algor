package Difficult2;

import java.util.Scanner;

public class swExpert11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int cost = sc.nextInt();
            System.out.println("#" + tc);
            for(int i = 0; i < money.length; i++){
                System.out.print(cost/money[i] + " ");
                cost %= money[i];
            }
            System.out.println();
        }
    }
}
