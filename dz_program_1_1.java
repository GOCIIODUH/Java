
/**
 * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
 */
import java.util.Scanner;

public class dz_program_1_1 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел: ");
        try (Scanner scanner = new Scanner(System.in)) {
            boolean flag = true;
            int sum = 0;
            int n1 = 0;
            int j = 0;
            while (flag) {
                int n = scanner.nextInt();
                if (n == 0) {
                    flag = false;
                } else {
                    if (n > 0) {
                        n1 = n;
                        j =0;
                    } else {
                        if (j == 0) {
                           sum += n1;
                           j++; 
                        } else {
                            n1 = 0;
                        }
                        

                    }
                }
            }
            System.out.println(sum);
        }
    }
    // public static void main(String[] args) {
    // System.out.println("Введите последовательность чисел: ");
    // try (Scanner scanner = new Scanner(System.in)) {
    // boolean flag = true;
    // int[] arr = new int[100];
    // int i = 0;
    // while (flag) {
    // int n = scanner.nextInt();
    // if (n == 0) {
    // flag = false;
    // } else {
    // arr[i] = n;
    // }
    // i++;
    // }
    // System.out.println(summa(arr));
    // }
    // }

    // public static int summa(int[] array) {
    // int sum = 0;
    // int n1 = 0;
    // int i = 0;
    // while (array[i] != 0) {
    // if (array[i] > 0) {
    // n1 = array[i];
    // } else {
    // sum += n1;
    // }
    // i++;
    // }
    // return sum;
    // }
}
