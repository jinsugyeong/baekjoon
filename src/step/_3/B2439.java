package step._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2439 {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        

        for(int i=0; i<cnt; i++){
            String s="";
            for(int j=0; j<=i; j++){
                s += "*";
            }
            for(int k=0; k<(cnt-s.length()); k++){
                System.out.print(" ");
            }
            System.out.println(s);
        }

    }
}
