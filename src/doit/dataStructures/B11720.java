package doit.dataStructures;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String input = sc.next();
        char[] inputArr = input.toCharArray();
        int sum = 0;

        for(char c : inputArr) {
            sum += (c - '0');
        }

        System.out.println(sum);
    }
}