package Ye;

class Stack {
    private int[] s;
    private int top;
    private void initialize() {
        s = new int[10];
        for(int i = 0; i < 10; i++)
            s[i] = 0;
    }
    Stack() {
        initialize();
        top = s.length-1;
    }
    void push(int x) {
        top--;
        top--;
        s[top+1] = x;
    }
    void pop() {
        top++;
    }
    void print() {
        for(int i = 0; i < 10; i++) {
            System.out.println("s["+i+"] = "+s[i]);
        }
    }
}
class Test3_5 {
    public static void main(String args[])
    {
        int data[] = { 1, 2, 3, 4, 5 };
        Stack p = new Stack();

        p.push(data[0]);
        p.push(data[1]);
        p.push(data[2]);
        p.pop();
        p.pop();
        p.pop();
        p.push(data[3]);
        p.push(data[4]);

        p.print();
    }
}