package step._10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int min = input;
        
        for(int i=1; i<input; i++){
            String str = String.valueOf(i);
            int wf = 1;
            int tmp = 0;
            for(int j=str.length()-1; j>=0; j--){
                tmp += wf *(str.charAt(j)-'0');
                tmp += str.charAt(j)-'0';
                wf *= 10;
            }
            if(tmp == input){
                min = (min < tmp) ? min : i;
            }
        }

        if( min == input){
            System.out.println("0");
        }else{
            System.out.println(min);
        }

    }
}