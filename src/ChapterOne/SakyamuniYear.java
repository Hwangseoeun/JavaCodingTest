package ChapterOne;

import java.util.Scanner;

public class SakyamuniYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Integer year = scanner.nextInt();

        Integer gap = 2541 - 1998;

        System.out.println(year - gap);
    }
}
