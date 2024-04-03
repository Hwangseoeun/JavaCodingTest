package Baekjoon;

import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String num = scanner.next();

        String[] number = new String[N];
        number = num.split("", N);

        int sum = 0;
        for (int i=0; i<N; i++){
            sum = sum + Integer.parseInt(number[i]);
        }
        System.out.println(sum);
    }
}
