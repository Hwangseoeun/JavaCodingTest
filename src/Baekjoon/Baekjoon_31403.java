package Baekjoon;

import java.util.Scanner;

public class Baekjoon_31403 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int num = A + B - C;
        int str = Integer.parseInt(Integer.toString(A)+Integer.toString(B)) - C;

        System.out.println(num);
        System.out.println(str);
    }
}
