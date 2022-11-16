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
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> inputList = new ArrayList<>();
		
		for(int i=1; i<N+1; i++) {inputList.add(i);}
		
		bw.write("<");
		while(true) {
			System.out.println(K + " " + inputList.get(K-1));

			bw.write(String.valueOf(inputList.get(K-1)));
			inputList.remove(K-1);
			if(inputList.size() < 1) break;
			else bw.write(", ");

			K += 2;
			if(K > inputList.size()) K %= inputList.size();
			if(K == 0) K = inputList.size();
		}
		bw.write(">");
		
		bw.flush();
		bw.close();
		
	}

}
