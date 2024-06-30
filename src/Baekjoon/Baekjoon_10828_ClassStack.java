package Baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon_10828_ClassStack {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        for(int i=0; i<N; i++){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);

            String command = st.nextToken();

            if(command.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("pop")){
                if(stack.empty()){
                    //System.out.println("-1");
                    bw.write("-1\n");
                }
                else{
                    //System.out.println(stack.pop());
                    bw.write(stack.pop()+"\n");
                }
            }
            else if(command.equals("size")){
                //System.out.println(stack.size());
                bw.write(stack.size()+"\n");
            }
            else if(command.equals("empty")){
                if(stack.empty()){
                    //System.out.println("1");
                    bw.write("1\n");
                }
                else{
                    //System.out.println("0");
                    bw.write("0\n");
                }
            }
            else if(command.equals("top")){
                if(stack.empty()){
                    //System.out.println("-1");
                    bw.write("-1\n");
                }
                else{
                    //System.out.println(stack.peek());
                    bw.write(stack.peek()+"\n");
                }
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}
