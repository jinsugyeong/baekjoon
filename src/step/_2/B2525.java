package step._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int setTime = Integer.parseInt(br.readLine());

        if(m+setTime < 60){
            m += setTime;
        }else {
            h = h + (m +setTime)/60;
            m = (m +setTime)%60;

            if(h >= 24) h -= 24;
        }

        System.out.println(h + " " + m);

    }
}
