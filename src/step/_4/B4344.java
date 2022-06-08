package step._4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B4344 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tcNum = Integer.parseInt(br.readLine());
        int arr[]=null;
        StringTokenizer st= null;        

        for(int i=0; i<tcNum; i++){
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            arr = new int[index];
            int sum=0; double avg=0; int cnt=0;

            for(int j=0; j<index; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            avg = sum/index;

            for(int n: arr){
                if(n > avg)cnt++;
            }

            double result = cnt*100.0/index;
            
            bw.write(String.format("%.3f", result));
            bw.write("%\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}