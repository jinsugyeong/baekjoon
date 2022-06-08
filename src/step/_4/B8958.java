package step._4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B8958 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int scoreArr[] = new int[cnt];
        String str[] = new String[cnt];
        String arr[]=null;
        int count=0;

        for(int i=0; i<cnt; i++){
            str[i] = br.readLine();
            arr = str[i].split("");

            count=0; scoreArr[i]=0;
            for(String s:arr){

                if(s.equals("O")){
                    count++;
                    scoreArr[i] += count;
                }else{
                    count = 0;
                }
            }
            
            bw.write(String.valueOf(scoreArr[i]+"\n"));
        }

        br.close();
        bw.flush();
        bw.close();        
    }
}