package step._7;

import java.util.Scanner;

public class B1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        int cnt=1;
        int tmp = 0;
        
        for(int i=1; i<n; i += cnt){
            if(n <= i)break;
            cnt++;
            tmp = i;
        }

        int a = (n-tmp);
        int b = (cnt - a +1);
        String result = (cnt%2==0)?a+"/"+b:b+"/"+a;

        System.out.println(result);
    }
}