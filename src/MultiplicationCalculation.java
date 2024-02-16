import java.util.Scanner;

public class MultiplicationCalculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Integer A = scanner.nextInt();
        Integer B = scanner.nextInt();

        System.out.println(A * (B%10));
        System.out.println(A * ((B%100)/10));
        System.out.println(A * (B/100));
        System.out.println(A * B);
    }
}
