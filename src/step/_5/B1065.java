package step._5;

import java.util.Scanner;

public class B1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int count = 0;
        

        for(int i=1; i<=number; i++){
            if(i < 100){
                count++;
            }else {
                String s = String.valueOf(i);
                String[] sArr = s.split("");
                int temp=10; int cnt=1;
                
                for(int j=0; j<sArr.length-1; j++){
                    int a = Integer.parseInt(sArr[j]);
                    int b = Integer.parseInt(sArr[j+1]);
                    if(temp==a-b)cnt++;
                    temp = a-b;
                }
                if(cnt == sArr.length-1)count++;
            }
            
        }

        System.out.println(count);
    }
}
