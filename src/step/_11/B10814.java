package step._11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String user[][] = new String[N][2];

        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());

            user[i][0] = st.nextToken();
            user[i][1] = st.nextToken();
        }

        Arrays.sort(user, new Comparator<String[]>() {
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for(int i=0; i<N; i++){
            bw.write(user[i][0] + " " + user[i][1] + "\n");
        }

        bw.flush();
        bw.close();
        
    }
}