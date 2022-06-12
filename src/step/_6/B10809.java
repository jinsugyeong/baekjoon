package step._6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		char[] inputArr = input.toCharArray();
		char s = 'a';
	

		for(int i=0; i<26; i++){
			int a = 0;
			for(int j=0; j<inputArr.length; j++){
				if(s == inputArr[j]){
					bw. write(String.valueOf(j));
					bw.write(" ");
					a = 1;
					break;
				}
			}

			if(a == 0){
				bw.write("-1 ");
			}
			
			s++;
		}

		br.close();
		bw.flush();
		bw.close();

	}
}
