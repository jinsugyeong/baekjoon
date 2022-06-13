package step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split(" ");
        int re = inputArr.length;

        for(String s : inputArr){
            if(s.equals("")){
                if(re == 0)break;
                re -= 1;
            }
        }

        System.out.println(re);

    }
}