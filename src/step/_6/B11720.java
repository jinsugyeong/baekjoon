package step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        int sum = 0;

        String input = br.readLine();
        String[] inputArr = input.split("");
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(inputArr[i]);
            sum += arr[i];
        }

        System.out.println(sum);
    }
}