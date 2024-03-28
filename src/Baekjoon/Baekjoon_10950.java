package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_10950 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        ArrayList<Integer> A = new ArrayList<>(11);
        ArrayList<Integer> B = new ArrayList<>(11);

        int a, b;

        for(int i=0; i<T; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            A.add(a);
            B.add(b);

            System.out.println(A.get(i)+B.get(i));
        }
    }
}
