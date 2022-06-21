package step._9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());

        System.out.println(getNum(num));
    }

    public static int getNum(int num){

        if(num == 0) return 1;
        return num *= getNum(num-1);
    }
}