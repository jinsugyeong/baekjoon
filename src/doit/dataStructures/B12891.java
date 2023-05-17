package doit.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891 {
    static int chk[];
    static int myArr[];
    static int chkCnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        char arr[] = new char[S];
        chk = new int[4];
        myArr = new int[4];
        chkCnt = 0;
        arr =br.readLine().toCharArray();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            chk[i] = Integer.parseInt(st.nextToken());
            if(chk[i] == 0) chkCnt++;
        }

        for(int i=0; i<P; i++) {    //초기 P부분 무자열 처리 부분
            Add(arr[i]);
        }

        if(chkCnt == 4) result++;

        for(int i=P; i<S; i++){
            int j= i-P;
            Add(arr[i]);
            Remove(arr[j]);

            if(chkCnt == 4) result++;
        }

        System.out.println(result);
        br.close();
    }

    /*
     * 새로 들어온 문자를 처리하는 함수
     */
    private static void Add(char c){    
        switch(c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == chk[0]) chkCnt++;
                break;

            case 'C':
                myArr[1]++;
                if(myArr[1] == chk[1]) chkCnt++; 
                break;

            case 'G':
                myArr[2]++;
                if(myArr[2] == chk[2]) chkCnt++; 
                break;

            case 'T':
                myArr[3]++;
                if(myArr[3] == chk[3]) chkCnt++; 
                break;
        }
    }


    /*
     * 제거되는 문자를 처리하는 함수
     */
    private static void Remove(char c) {
        switch(c) {
            case 'A':
                if(myArr[0] == chk[0]) chkCnt--;
                myArr[0]--;
                break;

            case 'C':
                if(myArr[1] == chk[1]) chkCnt--; 
                myArr[1]--;
                break;

            case 'G':
                if(myArr[2] == chk[2]) chkCnt--; 
                myArr[2]--;
                break;

            case 'T':
                if(myArr[3] == chk[3]) chkCnt--; 
                myArr[3]--;
                break;
        }
    }
}
