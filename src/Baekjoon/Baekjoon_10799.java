package Baekjoon;

import java.io.*;
import java.util.Stack;

public class Baekjoon_10799 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();

        int stick = 0;
        char previous = ' ';

        for(int i=0; i<input.length(); i++){
            char current = input.charAt(i);

            if(current == '('){
                stack.push(current);
            }
            else{
                stack.pop();
                if(previous == ')'){
                    stick += 1;
                }
                else{
                    stick += stack.size();
                }
            }
            previous = current;
        }
        System.out.println(stick);
    }
}