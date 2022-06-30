package step._11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];
        
        int tmp[] = new int[2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i][0] > arr[j][0] || (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1])){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i=0; i<N; i++){
            bw.write(arr[i][0] + " " + arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();

    }
}
