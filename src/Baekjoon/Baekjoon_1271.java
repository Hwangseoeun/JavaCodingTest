package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_1271 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger m = scanner.nextBigInteger();
        BigInteger n = scanner.nextBigInteger();

        BigInteger quotient = m.divide(n);
        BigInteger remainder = m.mod(n);

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
