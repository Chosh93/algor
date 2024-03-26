package Difficult2;

import java.util.Scanner;

public class swExpert5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        String[] strArr = new String[T];
        for(int i = 0; i < T; i++){
            strArr[i] = sc.nextLine();
            if(strArr[i].length() >= 3 && strArr[i].length() <= 10){
                String reverse = new StringBuffer(strArr[i]).reverse().toString();
                if(strArr[i].equals(reverse)){
                    System.out.println("#"+(i+1)+" 1");
                }else {
                    System.out.println("#"+(i+1)+" 0");
                }
            }
        }
    }
}
