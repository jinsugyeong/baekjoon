package step._8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        for(int i=0; i<cnt; i++){
            int inputNum = Integer.parseInt(st.nextToken());
            boolean isPrime = true;

            if(inputNum == 1)continue;

            for(int j=2; j <= Math.sqrt(inputNum); j++){
                if(inputNum % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)result++;

        }

        System.out.println(result);
    }
}