
/**
 * Учитывая входную строку, измените порядок слов в обратном порядке.
 */

import java.util.Scanner;

public class dz_program_1_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] text = new String[10000];
            System.out.println("Введите текст: ");
            text = scanner.nextLine().split(" ");
            System.out.println(textOpposite(text));
        }
    }

    private static String textOpposite(String[] s) {
        String textOpposite = "";
        for (int i = s.length; i > 0; i--) {
            textOpposite += s[i - 1] + " ";
        }
        return textOpposite;
    }
}