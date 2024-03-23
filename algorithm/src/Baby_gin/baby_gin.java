package Baby_gin;
import java.util.*;

public class baby_gin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("6자리 숫자 입력 : ");
        int num = sc.nextInt();
        String strNum = String.valueOf(num);
        int triple = 0;
        int run = 0;
        int[] count = new int[10];
        if (strNum.length() == 6) {
            for (int i = 0; i < 6; i++) {
                count[num % 10]++;
                num /= 10;
            }

            for (int i = 0; i < 10; i++) {
                if (count[i] >= 3) {
                    triple++;
                    count[i] -= 3;
                    i--;
                }
                if (count[i] >= 1 && count[i + 1] >= 1 && count[i + 2] >= 1) {
                    run++;
                    count[i]--;
                    count[i + 1]--;
                    count[i + 2]--;
                    i--;
                }
            }
            if(triple + run == 2){
                System.out.println("Baby-gin" + " (triple : " + triple + " run : " + run + ")");
            } else{
                System.out.println("Not Baby-gin" + " (triple : " + triple + " run : " + run + ")");
            }
        }
        else{
            System.out.println("6자리 수 입력");
        }
    }
}