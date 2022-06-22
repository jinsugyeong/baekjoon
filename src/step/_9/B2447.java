package step._9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2447 {
    static char[][] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        get_star(0, 0, N, false);

        for(int i=0; i<N; i++){
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void get_star(int x, int y, int N, boolean blank){
        /**
         * 3*3인 칸에서 5번째 공백 -> 재귀 필요x 
         * 9*9인 칸의 한 칸을 3*3으로 보면 5번째 3*3칸 공백 
         * 27*27 칸은 5번째 9*9칸이 공백
         *      -> 배열 값 정하던 for문을 재귀호출로 쓰고, 그 위에 조건문으로 배열 값 처리
         */
        
        //가운데 공백칸
        if(blank){
            for(int i=x; i<x+N; i++){
                for(int j=y; j<y+N; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(N == 1){
            arr[x][y] = '*';
            return;
        }

        int cnt=0;
        int pattern = N/3;

        /**
         * i의 시작이 x여야 9x9일 때 
         * (0,0) / (0,1) / (0,2) 칸으로 
         * arr[0][0], a[0][3], a[0][6]
         * for문 돌려줄 수 있음...
         */
        for(int i=x; i<x+N; i+=pattern){
            for(int j=y; j<y+N; j+=pattern){
                cnt++;
                //배열에 넣었던 i,j 값을 for문을 한 번 더 돌린다는 생각으로 재귀호출 해줘야함
                if(cnt == 5){
                    //공백칸
                    get_star(i, j, pattern, true);
                }else {
                    get_star(i, j, pattern, false);
                }
            }
        }

    } 
}