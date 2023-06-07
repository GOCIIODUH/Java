package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class dzprogramxcvxzcvzxcvzxcv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(text));
        String textOpposite = "";
        int i = 0;
        for (i = text.length; i > 0; i--){
            textOpposite += text[i] + " ";
        }
        System.out.println(textOpposite);
    }
}
