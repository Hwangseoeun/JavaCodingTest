package Baekjoon;

import java.util.Scanner;

public class Baekjoon_2675 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i=0; i<T; i++){
            int R = scanner.nextInt();
            String S = scanner.next();

            String[] text = new String[R];
            text = S.split("", S.length());

            for(int j=0; j<S.length(); j++){
                for(int k=0; k<R; k++) {
                    System.out.print(text[j]);
                }
            }
            System.out.println("");
        }
    }
}
