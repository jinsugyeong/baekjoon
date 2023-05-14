package doit.dataStructures;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B11659 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N+1];
        int sumArr[] = new int[N+1];

        for(int i=1; i<=N; i++){
            arr[i] = sc.nextInt();

            sumArr[i] =  sumArr[i-1] + arr[i];

        }


        for(int i=0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            bw.write(String.valueOf(sumArr[y] - sumArr[x-1]));
            bw.newLine();
        }
        sc.close();
        bw.flush();
        bw.close();

    }
}
