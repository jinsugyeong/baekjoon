package step._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum=0; int i=1;

        while(true){
            sum += i;
            if(i == num)break;
            i++;
        }

        System.out.println(sum);
    }
}
