package step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class B1316 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int result = 0; 

        for(int i=0; i<cnt; i++){
            String input = br.readLine();
            String[] inputArr = input.split("");
            HashSet<String> inputSet = new HashSet<>(Arrays.asList(inputArr));
            boolean gt = true;

            for(String s: inputSet){
                int index = input.indexOf(s);
                while(index != -1){
                    if(input.indexOf(s, index+1) - index > 1){
                        gt = false;
                        break;
                    }
                    index = input.indexOf(s, index+1);
                }
            }
            if(gt == true)result++;
        }

        System.out.println(result);
    }
}
