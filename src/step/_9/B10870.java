package step._9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        System.out.println(get_fibonacci(num));
    }

    public static int get_fibonacci(int num){

        if(num == 0){
            return 0;
        }else if(num == 1 || num == 2){
            return 1;
        }else {
            return get_fibonacci(num-1) + get_fibonacci(num-2);
        }
    }
}