package step._10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean arr[][] = new boolean[N][M];
        int min = 64;

        for(int i=0; i<N; i++){
            String str = br.readLine();

            for(int j=0; j<M; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }

        for(int i=0; i<N-7;i++){          //세로시작점
            for(int j=0; j<M-7; j++){      //가로시작점
                int tmp = 0;
                boolean TF = arr[i][j];     //첫 번째 칸의

               for(int k=i; k<i+8; k++){      //세로
                    for(int z=j; z<j+8; z++){   //가로   
                        if(arr[k][z] != TF)tmp++;
                        TF = (!TF);
                    }
                    TF = !TF;
               }
               tmp = Math.min(tmp, 64-tmp);
               min = (min < tmp)?min:tmp;
            }
        }

        System.out.println(min);


    }
}
