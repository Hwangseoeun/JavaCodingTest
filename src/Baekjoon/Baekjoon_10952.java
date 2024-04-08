package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10952 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if(A==0 && B==0){
                break;
            }

            int sum = A + B;

            System.out.println(sum);
        }
    }
}
