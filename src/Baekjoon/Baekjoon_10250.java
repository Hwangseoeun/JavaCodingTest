package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor=0, num=0;

            if(N%H!=0){
                floor = N%H;
                num = N/H + 1;
            }
            else{
                floor = H;
                num = N/H;
            }

            StringBuilder sb = new StringBuilder();

            if(num >= 10){
                sb.append(floor);
                sb.append(num);
            }
            else{
                sb.append(floor);
                sb.append(0);
                sb.append(num);
            }

            bw.write(Integer.parseInt(sb.toString())+"\n");
        }

        bw.flush();
        bw.close();
    }
}
