package Baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Baekjoon_10807 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] num = new String[N];

        for(int i=0; i<N; i++){
            num[i] = scanner.next();
        }

        int v = scanner.nextInt();

        ArrayList<String> num_arr = new ArrayList<>(Arrays.asList(num));

        System.out.println(Collections.frequency(num_arr,Integer.toString(v)));
    }
}
