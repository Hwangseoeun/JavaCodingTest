package Algorithm;

public class ArrayStack {
    int top;
    int size;
    int [] stack;

    public ArrayStack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item){
        stack[++top]= item;
        System.out.println(stack[top] + "push");
    }

    public void pop(){
        System.out.println(stack[top] + "pop");
        int pop = stack[top];
        stack[top--] = 0;
    }

    public void peek(){
        System.out.println(stack[top] + "peek");
    }
}
