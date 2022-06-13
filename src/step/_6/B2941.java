package step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj","s=", "z="};
        
        for(String s : arr){
            if(input.contains(s)){
                input = input.replace(s, "@");
            }
        }

        int result = input.length();
        System.out.println(result);
    }
}