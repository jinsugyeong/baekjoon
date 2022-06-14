package step._7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            String result = st.nextToken();
            int guest = Integer.parseInt(st.nextToken());

            if(guest%h != 0){
                result = String.valueOf(guest%h);
                if((guest/h+1) < 10) result += "0";
                result += (guest/h + 1);
            }else{
                result = String.valueOf(h);
                if((guest/h) < 10) result += "0";
                result += (guest/h);
            }           

            bw.write(result+"\n");
        }

        bw.flush();
        bw.close();
    }
}
