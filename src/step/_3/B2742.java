package step._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        while(true){
            System.out.println(cnt);
            cnt--;
            if(cnt < 1){
                break;
            }
        }
    }
}
