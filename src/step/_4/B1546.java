package step._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        double scoreArr[] = new double[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double sum = 0;

        for(int i=0; i<cnt; i++){
            scoreArr[i] = Integer.parseInt(st.nextToken());
            max = (max>scoreArr[i])?max:scoreArr[i];
        }

        for(double score: scoreArr){
            score = score/max*100;
            sum += score;
        }

        System.out.println(sum/cnt);
    }
}
