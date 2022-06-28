package step._10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        int tmp = 666;

        for(int i=0; i<N; i++){
            arr[i] = tmp;
            while(true){
                tmp++;
                if(String.valueOf(tmp).contains("666")) break;
            }
        }

        System.out.println(arr[N-1]);
    }
}