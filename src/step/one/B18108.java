package step.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputYear = Integer.parseInt(br.readLine());
        int result = inputYear - 543;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}