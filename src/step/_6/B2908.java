package step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int tmp=0;

        tmp = a/100 + a%100/10*10 + a%100%10*100;
        a = tmp;

        tmp = b/100 + b%100/10*10 + b%100%10*100;
        b = tmp;

        tmp = (a >= b)? a: b;
        System.out.println(tmp);
    }
}
