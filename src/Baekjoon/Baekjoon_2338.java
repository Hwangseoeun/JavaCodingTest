package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_2338 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}
