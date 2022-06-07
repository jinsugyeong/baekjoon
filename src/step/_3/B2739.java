package step._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gugu = Integer.parseInt(br.readLine());
        
        for(int i=1; i<10; i++){
            System.out.printf("%d * %d = %d\n", gugu, i, (gugu*i));
        }
    }
}
