package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int money = 0;
        if(A==B && B==C){
            money = 10000+A*1000;
        }
        else if(A==B || B==C || A==C){
            if(A==B || A==C){
                money = 1000+A*100;
            }
            else{
                money = 1000+B*100;
            }
        }
        else{
            int max = Math.max(A, Math.max(B,C));
            money = max*100;
        }

        System.out.println(money);
    }
}
