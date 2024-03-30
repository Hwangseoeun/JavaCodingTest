package Baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_1152 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringTokenizer t = new StringTokenizer(text, " ");
        System.out.println(t.countTokens());

/*        Scanner scanner = new Scanner(System.in);

        String[] text_li = new String[1000000];

        String text = scanner.nextLine();

        text = text.strip();

        text_li = text.split(" ", text.length());

        System.out.println(text_li.length);*/
    }
}
