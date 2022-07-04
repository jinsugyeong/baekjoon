package step._11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class B1181 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];        

        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        Set<String> set = new HashSet<String>(Arrays.asList(arr));
        arr = set.toArray(new String[0]);

        Arrays.sort(arr);
        String tmp="";

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].length() > arr[j].length()){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(String s: arr){
            bw.write(s+"\n");
        }
        bw.flush();
        bw.close();
    }
}