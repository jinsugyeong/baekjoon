package step._10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B7568 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int h[] = new int[cnt];
        int w[] = new int[cnt];

        for(int i=0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            h[i] = Integer.parseInt(st.nextToken());
            w[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<cnt; i++){
            int rank=1;
            for(int j=0; j<cnt; j++){
                if(h[i]<h[j] && w[i]<w[j]){
                    rank++;
                }
            }
            bw.write(rank+" ");
        }

        bw.flush();
        bw.close();
    }
}
