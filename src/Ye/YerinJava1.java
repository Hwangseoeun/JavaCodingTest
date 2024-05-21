package Ye;

class Point {
    static int x;
    static int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }
    Point(int p) {
        x = p;
        y = p;
    }
    Point(int a,int b) {
        x = a;
        y = b;
    }
    Point plus(Point p) {
        Point tmp = new Point();
        tmp.x =  x + p.x;
        tmp.y = y + p.y;
        return p;
    }
    Point minus(Point p) {
        Point tmp = new Point();
        tmp.x = x - p.x;
        tmp.y = y - p.y;
        return this;
    }
    void print() {
        System.out.println("("+x+","+y+")");
    }
}
class Test2_11 {
    public static void main(String args[])
    {
        int key[] = { 1, 2, 3, 4, 5 };

        Point p1 = new Point();
        p1.x = key[0]; p1.y = key[1];
        Point p2 = new Point(key[2]);
        Point p3 = new Point(key[3],key[4]);
        p1 = p1.plus(p2);
        p3 = p2.minus(p1);

        p1.print();
        p2.print();
        p3.print();
    }
}