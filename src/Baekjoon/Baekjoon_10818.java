package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10818 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] num = new int[N];

        for(int i=0; i<N; i++){
            num[i] = scanner.nextInt();
        }

        int min = Arrays.stream(num).min().getAsInt();
        int max = Arrays.stream(num).max().getAsInt();

        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }
}
