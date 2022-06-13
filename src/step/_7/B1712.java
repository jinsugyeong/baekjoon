package step._7;

import java.util.Scanner;

public class B1712 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        int cnt=0;
        
        if(c-b != 0){
            cnt = a/(c-b)+1;
            cnt = (cnt>0)?cnt:-1;
        }else {
            cnt = -1;
        }        
        
        System.out.println(cnt);        
    }
}