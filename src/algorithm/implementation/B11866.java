package algorithm.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
		
		int i = 3;
		bw.write("<");
		while(inputList.size() == 0) {
			if(inputList.size() < i) {i %= inputList.size();}
			bw.write(String.valueOf(inputList.get(i-1)));
			inputList.remove(i-1);
		}
		bw.write(">");
		
		bw.flush();
		bw.close();
		
	}

}
