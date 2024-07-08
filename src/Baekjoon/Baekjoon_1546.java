package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] score = new double[N];
        double average = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        double max = Arrays.stream(score).max().getAsDouble();

        for(int i=0; i<N; i++){
            score[i] = score[i]/max*100;
        }

        average = Arrays.stream(score).average().getAsDouble();

        System.out.println(average);
    }
}
