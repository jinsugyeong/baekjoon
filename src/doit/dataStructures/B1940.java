package doit.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class B1940 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[] = new int[N];

            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int cnt = 0;
            int i = 0;
            int j = N-1;

            while(i < j) {
                if(arr[i] + arr[j] < M) {
                    i++;
                }else if(arr[i] + arr[j] > M) {
                    j--;
                }else {
                    cnt++;
                    i++;
                    j--;
                }
            }

            System.out.println(cnt);
        }
    }
}
