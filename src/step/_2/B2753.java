package step._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputYear = Integer.parseInt(br.readLine());
        int result;

        if(inputYear % 4 == 0){
            if(inputYear % 100 != 0){
                result = 1;
            }else if(inputYear % 400 == 0){
                result = 1;
            }else {
                result = 0;
            }
        }else {
            result = 0;
        }

        System.out.println(result);
    }
}
