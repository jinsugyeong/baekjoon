package step._8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2581 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = N;

        for(int i=M; i<=N; i++){
            boolean isPrime = true;

            if(i == 1)continue;
            
            for(int j=2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                sum+=i;
                min = (min < i)?min:i;
            }
        }

        if(sum == 0){
            bw.write("-1");
        }else{
            bw.write(String.valueOf(sum));
            bw.write("\n");
            bw.write(String.valueOf(min));
        }

        bw.flush();
        bw.close();
    }
}
