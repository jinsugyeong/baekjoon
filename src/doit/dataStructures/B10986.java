package doit.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class B10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        int sumArr[] = new int[N];
        int cnt[] = new int[M];
        int result = 0;


        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());

            if(i > 0) sumArr[i] = sumArr[i-1] + arr[i];
            else sumArr[i] = arr[i];

            sumArr[i] %= M;
            cnt[sumArr[i]]++;
        }

        result += cnt[0];

        for(int i=0; i<M; i++){
            if(cnt[i] > 1){
                result += (cnt[i] * (cnt[i] - 1) / 2);
            }
        }

        System.out.println(result);
    }
}
