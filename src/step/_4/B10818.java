package step._4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[cnt];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<cnt; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = numArr[0];
        int max = numArr[0];    //0으로 초기화하면 0보다 작은 수가 들어왔을 때 max가 무조건 0이 됨

        for(int n: numArr){
            min = (min<n)?min:n;
            max = (max>n)?max:n;
        }

        bw.write(String.valueOf(min));
        bw.write(" ");
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}