package step._8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        for(int i=min; i<=max; i++){
            boolean isPrime=true;

            if(i==1)continue;

            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){bw.write(i+"\n");}
        }
        bw.flush();
        bw.close();
    }
}