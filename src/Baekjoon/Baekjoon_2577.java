package Baekjoon;

import java.util.*;

public class Baekjoon_2577 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        String mul = Integer.toString(A * B * C);
        String[] mul_li = new String[mul.length()];
        mul_li = mul.split("", mul.length());

        List<String> li = new ArrayList<>(Arrays.asList(mul_li));

        System.out.println(Collections.frequency(li,"0"));
        for(int i=1; i<10; i++){
            System.out.println(Collections.frequency(li, Integer.toString(i)));
        }
    }
}
