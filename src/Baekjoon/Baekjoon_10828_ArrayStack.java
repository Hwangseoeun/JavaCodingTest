package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_10828_ArrayStack {

    int top;
    int size;
    int[] stack;

    public Baekjoon_10828_ArrayStack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item){
        stack[++top] = item;
    }

    public int pop(){
        if(top == -1){
            return -1;
        }

        int pop = stack[top];
        stack[top--] = 0;

        return pop;
    }

    public int size(){
        return top+1;
    }

    public int empty(){
        if(top == -1){
            return 1;
        }
        return 0;
    }

    public int top(){
        if(top == -1){
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        Baekjoon_10828_ArrayStack stack = new Baekjoon_10828_ArrayStack(N);

        for(int i=0; i<N; i++){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);

            String command = st.nextToken();

            if(command.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("pop")){
                bw.write(stack.pop()+"\n");
            }
            else if(command.equals("size")){
                //System.out.println(stack.size());
                bw.write(stack.size()+"\n");
            }
            else if(command.equals("empty")){
                bw.write(stack.empty()+"\n");
            }
            else if(command.equals("top")){
                bw.write(stack.top()+"\n");
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}
