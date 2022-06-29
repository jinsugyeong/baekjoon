package step._11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * 카운팅 정렬
 * 1. 그 숫자가 포함된 인덱스값 +1
 * 2. 누적합으로 변경
 * 3. 숫자를 마지막부터 순회하여, 예를 들어 숫자 1 -> 누적합 카운팅 배열 인덱스 1 -> 의 값이 12 -> count 값 "12-1"처리 > =11번 인덱스에 넣으면됨
 */
public class B10989 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        int count[] = new int[10001];   //카운팅 배열 선언
        int input[] = new int[cnt];   //숫자입력배열
        int arr[] = new int[cnt];   //result
        int max = 0;

        
        for(int i=0; i<cnt; i++){
            input[i] = Integer.parseInt(br.readLine());     //입력배열에 숫자 입력
            count[input[i]] += 1;   //카운팅 배열에 포함 숫자 만큼 +1
            max = (max > input[i])?max:input[i];
        }
        
        for(int i=1; i<=max; i++){
            count[i] += count[i-1];     //누적합으로 변경
        }

        for(int i=cnt-1; i>=0; i--){
            int idx = count[input[i]]-1;
            
            arr[idx] = input[i];
            count[input[i]] -= 1;
        }

        for(int i:arr){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();

    }
}