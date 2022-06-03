package step.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = (a+b)%c;

        bw.write(String.valueOf(result));
        bw.newLine();
        
        result = ((a%c) + (b%c))%c;
        bw.write(String.valueOf(result));
        bw.newLine();

        result = (a*b)%c;
        bw.write(String.valueOf(result));
        bw.newLine();

        result = ((a%c) * (b%c))%c;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
