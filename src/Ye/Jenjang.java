package Ye;

import java.security.PublicKey;
import java.util.Scanner;

public class Jenjang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0, num = 0;

        int[] a = new int[N];
        int[] b = new int[N];

        int[] day1 = new int[N];
        int[] day2 = new int[N];

        for(int i=0; i<N; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i=0; i<N; i++) {
            b[i] = scanner.nextInt();
        }

        for(int i=0; i<N; i++){
            for(int j=num; j<N; j++){
                if(a[i] == b[j]){
                    count++;
                    num = j;
                }
            }
        }
        System.out.println(count);
    }
}
