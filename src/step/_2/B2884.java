package step._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int setTime = 45;
        String result;

        if (h == 0){
            if(m >= setTime) {
                result = "0 ";
                result += m-setTime;
            }else {
                result = "23 ";
                result += m+(60-setTime);
            }
        }else{
            if (m >= setTime) {
                result = h + " ";
                result += (m-setTime);
            }else{
                result = (h-1) + " ";
                result += (m + (60-setTime));
            }
        }

        System.out.println(result);

        
    }
}