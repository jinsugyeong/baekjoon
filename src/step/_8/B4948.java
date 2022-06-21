package step._8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B4948 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            int tc = Integer.parseInt(br.readLine());
            if(tc==0)break;
            int cnt = 0;

            for(int i=(tc+1); i<=(2*tc); i++){
                boolean isPrime = true;
    
                if(i == 1)continue;
                
                for(int j=2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
    
                if(isPrime)cnt++;
            }

            bw.write(cnt+"\n");
        }

        bw.flush();
        bw.close();
    }
}
