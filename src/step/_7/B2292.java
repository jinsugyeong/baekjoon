package step._7;

import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        //int[] arr = {1,7,19,37,61,92};  a1=6*0+1 , a2=6*1 + a1 , a3 =6*2+ a2, 
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int cnt=0;
        in.close();

        for(int i=1; i<num; i+=(6*cnt)){
            if(num < i)break;
            cnt++;
        }

        System.out.println(cnt+1);
    }    
}
