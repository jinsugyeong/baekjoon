package step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
    public static void main(String[] args) throws IOException {
        char[] d = {'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W'};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        char[] inputArr = input.toCharArray();
        int result = 0;
        
        for(char inputChar : inputArr){
            
            if(inputChar >= 'W'){
                result += 10;
                System.out.println(inputChar >= 'W');
            }else{
                for(int j=0; j<d.length; j++){
                    if(inputChar < d[j]){
                         result += (j+2);
                         break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
