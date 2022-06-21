package step._8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 첫 번째 수를 짝수n의 1/2값으로 설정한 뒤 
 * for문으로 소수가 아닐 시 1씩 마이너스시키고 
 * 두 번째 수를 짝수n에서 첫 번째 수를 뺀 값으로 설정하고
 * 두 번째 수가 소수가 아니면 다시 첫 번째 수를 재설정하게 하고 싶어서
 * 재귀호출을 썼는데 계속 오류가나서 실패
 */

public class B9020 {
    public static int solution(int num, int a, int b){

        for(int i=2; i <= Math.sqrt(b); i++){
            if(b % i == 0){
                a = b - 1;
            }
        }

        if(a <= 0){
            a = b;
        }else {
            b = num - a;
        }

        boolean isPrime = true;
        for(int i=2; i <= Math.sqrt(b); i++){
            if(b % i == 0){
                isPrime = false;
                break;
                // System.out.println("a: "+ a + " b: "+ b);
            }
        }        

        if(isPrime){
            return b;
        }else {
            return solution(num, a, b);
        }
    }

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        while(cnt != 0){

            int num = Integer.parseInt(br.readLine());
            int b = num/2;
            int a = 0;

            b = solution(num, a, b);
            a = num - b;

            System.out.println(a);
            System.out.println(b);

            cnt--;
        }

        bw.flush();
        bw.close();
    }
}