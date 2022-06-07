package step._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[index];
        String result ="";

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int a: arr){
            if(a<num)result+=a+" ";
        }

        System.out.println(result);
    }
}
