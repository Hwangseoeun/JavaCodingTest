import java.util.Scanner;

public class Plus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        int plus = Integer.parseInt(A) + Integer.parseInt(B);
        System.out.println(plus);
    }
}