package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_25305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] score = new int[N];
        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(st2.nextToken());
        }

        int key = 0, j;
        for(int i=1; i<N; i++){
            key = score[i];

            for(j=i-1; j>=0 && score[j]>key; j--){
                score[j+1] = score[j];
            }

            score[j+1] = key;
        }

        System.out.println(score[N-k]);
    }
}
