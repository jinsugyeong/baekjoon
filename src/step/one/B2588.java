package step.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        String b  = br.readLine();

        
        String[] bArr = b.split("");
        int j = 1;
        int result = 0;
        int c;

        for(int i=bArr.length-1; i>=0; i--){
           c = a * Integer.parseInt(bArr[i]);
           System.out.println(c);
           result += (c * j) ;
           
           j *= 10;
        }

        System.out.println(result);

        
    }
}
