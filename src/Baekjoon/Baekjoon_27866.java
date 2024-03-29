package Baekjoon;

import java.util.Scanner;

public class Baekjoon_27866 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int i = scanner.nextInt();

        String[] S_list = S.split("", S.length());

        System.out.println(S_list[i-1]);
    }
}