package step._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] arr = new int[9];
        int max = 0;
        int cnt=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = (max>arr[i])?max:arr[i];
        }

        for(int n : arr){
            if(max == n)break;
            cnt++;
        }

        System.out.println(max+"\n"+cnt);
    }
}
