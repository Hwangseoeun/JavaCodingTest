package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        for(int i=0; i<9; i++){
            A[i] = scanner.nextInt();
        }

        int max = Arrays.stream(A).max().getAsInt();

        int j = 0;
        for(j=0; j<9; j++){
            if(A[j] == max){
                break;
            }
        }

        System.out.println(max);
        System.out.println(j+1);
    }
}
