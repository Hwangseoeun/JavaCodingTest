package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[3];
        for(int i=0; i<3; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<3-1; i++){
            for(int j=0; j<2-i; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for(int j=0; j<3; j++){
            System.out.print(A[j]+" ");
        }
    }
}
