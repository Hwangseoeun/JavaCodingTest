package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2920 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] note = new int[8];
        for(int i=0; i<8; i++){
            note[i] = scanner.nextInt();
        }
        //해결 완료
        //반례 : 8 2 3 4 5 6 7 1
        //출력되어야 하는 값 : mixed / 출력되는 값 : descending
        //반례 : 1 2 3 4 5 6 8 7
        //출력되어야 하는 값 : mixed / 출력되는 값 : ascending

        int[] as = new int[]{1,2,3,4,5,6,7,8};
        int[] de = new int[]{8,7,6,5,4,3,2,1};
        if(Arrays.equals(note, as)){
            System.out.println("ascending");
        }
        else if(Arrays.equals(note, de)){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}
