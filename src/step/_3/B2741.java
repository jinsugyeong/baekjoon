package step._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int i=1;

        while(true){
            System.out.println(i);
            i++;
            if(i > cnt){
                break;
            }
        }
    }
}
