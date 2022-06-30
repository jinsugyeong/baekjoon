package step._11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //sort 메서드 람다식 이용
        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }else {
                return a[0] - b[0];
            }
        });

        for(int i=0; i<N; i++){
            bw.write(arr[i][0] + " " + arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();

    }
}
