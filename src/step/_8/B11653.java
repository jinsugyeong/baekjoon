package step._8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11653 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        if(num == 1){
            return;
        }else {
           for(int i=2; i<=num; i++){
                while(num%i == 0){
                    num /= i;
                    bw.write(i+"\n");
                }
           }
        }

        
        bw.flush();
        bw.close();
    }
}