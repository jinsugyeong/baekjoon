package algorithm.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> inputList = new ArrayList<>();
		
		for(int i=1; i<N+1; i++) {inputList.add(i);}
		
		bw.write("<");
		
		N = K;
		while(true) {
			N--;
			bw.write(String.valueOf(inputList.get(N)));
			inputList.remove(N);

			if(inputList.size() < 1) break;
			else bw.write(", ");

			N += K;
			if(N > inputList.size()) N %= inputList.size();
			if(N == 0) N = inputList.size();
		}
		bw.write(">");
		
		bw.flush();
		bw.close();
	}
}
