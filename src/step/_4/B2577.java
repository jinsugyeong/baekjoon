package step._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numArr[] = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String div = String.valueOf(a*b*c);
        String[] divArr = div.split("");

        for(int i=0; i<10; i++) {
            //i를 계산값에서 찾고 찾은 수만큼 +1시켜줘야함
            for(String s: divArr){
                if(i == Integer.parseInt(s)){
                    numArr[i]++;
                }
            }
        }
        for(int n: numArr){
            System.out.println(n);
        }
    }
}
