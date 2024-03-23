package ChapterOne;

import java.util.Scanner;

public class PlusCicle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();

        String[] spell = N.split("", 2);

        int sum = 0, count = 0, i = 0;

        while (true) {
            spell[i + 2] = Integer.toString(Integer.parseInt(spell[i]) + Integer.parseInt(spell[i + 1]));
            sum = Integer.parseInt(spell[i + 1] + spell[i + 2]);
            count++;

            if (Integer.parseInt(N) == sum) {
                break;
            }
        }
        System.out.println(count);
    }
}
