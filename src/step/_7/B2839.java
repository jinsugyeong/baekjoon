package step._7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt=0;

        while(true){
            if(num % 5 == 0){
                System.out.println((num/5 + cnt));
                break;
            }
            else if(num < 0){
                System.out.println(-1);
                break;
            }
            num -= 3;
            cnt++;
        }
    }
}