package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    count++;
                }
            }

/*            for(int j=0; j<N; j++){
                System.out.print(A[j]+" ");
            }
            System.out.println("");*/
        }
        System.out.println(count);
    }
}
