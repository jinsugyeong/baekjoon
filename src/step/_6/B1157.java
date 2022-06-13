package step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws IOException {
        int[] al = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        char[] inputArr = input.toCharArray();

        for(char c : inputArr){

            for(int j=0; j<al.length; j++){
                if((int)c == (j+65)){
                    al[j] += 1;
                    //System.out.println("인덱스: "+ j +" 값: "+al[j]);
                }
            }
        }

        int max = -1;
        int index= 0;
        int cnt=0;
        for(int i=0; i<al.length; i++){
            if(max < al[i]){
                max = al[i];
                index = i;
            }
        }

        for(int a : al){
            if(a == max)cnt++;
        }

        if(cnt > 1){
            System.out.println("?");
        }else{
            System.out.println((char)(65+index));
        }


    }
}
