package step._7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int day = (m - down)/(up-down);

        if((m - down)%(up-down) != 0){
            day++;
        }

        System.out.println(day);
    }
}