package step._11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2108 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int count[] = new int[8001];
        int sum =0, max=-4000, min=4000, center=10000, mode = 10000;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i]+4000]++;

            if(max < arr[i]) max=arr[i];
            if(min > arr[i]) min=arr[i];
        }

        int cnt = 0;
        int mode_max = 0;
        boolean flag = false;

        for(int i=min+4000; i<= max+4000; i++){
            //중앙값 구하기
            if(count[i] != 0) {
                if(cnt < (N+1)/2){
                    cnt += count[i];
                    center = i - 4000;
                }
            }

            //최빈값 구하기
            if(mode_max < count[i]) {
                mode_max = count[i];
                mode = i - 4000;
                flag = true;
            }else if(mode_max == count[i] && flag == true){
                mode = i - 4000;
                flag = false;
            }
        }

        bw.write((int)Math.round((double)sum/N)+"\n");
        bw.write(center+"\n");
        bw.write(mode+"\n");
        bw.write((max-min)+"\n");

        bw.flush();
        bw.close();
    }
}