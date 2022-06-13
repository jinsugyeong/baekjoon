package step._6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2675 {
 
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());


		for(int i=0; i<cnt; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int forCnt = Integer.parseInt(st.nextToken());
			String forStr = st.nextToken();
			char[] forStrArr = forStr.toCharArray();

			for(char c : forStrArr){
				for(int j=0; j<forCnt; j++){
					bw.write(c);
				}
			}
			bw.write("\n");

		}

		bw.flush();
		bw.close();
 
	} 
}
