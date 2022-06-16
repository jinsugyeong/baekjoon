package step._7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String a = st.nextToken();
        String b = st.nextToken();

        int max = (a.length() >= b.length())?a.length():b.length();
        int[] aArr = new int[max+1];
        int[] bArr = new int[max+1];

        int idx = 0;

        for(int i=a.length()-1;i>=0; i--){
            aArr[idx] = a.charAt(i)-'0';
            idx++;
        }

        idx = 0;
        for(int i=b.length()-1;i>=0; i--){
            bArr[idx] = b.charAt(i)-'0';
            idx++;
        }

        for(int i=0; i<max; i++){
            int val = aArr[i] + bArr[i];
            aArr[i] = val%10;
            aArr[i+1] = aArr[i+1]+(val/10);
        }

        if(aArr[max] != 0){
            bw.write(String.valueOf(aArr[max]));
        }

        for(int i=max-1; i>=0; i--){
            bw.write(String.valueOf(aArr[i]));
        }

        bw.flush();
        bw.close();
    }
}
