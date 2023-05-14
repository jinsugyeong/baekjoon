package doit.dataStructures;

import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        long max = 0;
        long sum = 0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            max = (max<arr[i]) ? arr[i] : max;
            sum += arr[i];
        }

        System.out.println(sum * 100.0 / max / N);
    }
}