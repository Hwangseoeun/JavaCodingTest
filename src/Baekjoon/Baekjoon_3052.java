package Baekjoon;

import java.util.*;

public class Baekjoon_3052 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] num_list = new int[10];

        for(int i=0; i<10; i++){
            num_list[i] = scanner.nextInt();
        }

        int[] remain = new int[10];

        for(int i=0; i<10; i++){
            remain[i] = num_list[i]%42;
        }

        System.out.println(Arrays.stream(remain).distinct().count());
    }
}
