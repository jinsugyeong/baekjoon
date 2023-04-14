package algorithm.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class B10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		int tmp = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<K; i++) {
			tmp = Integer.parseInt(br.readLine());
			
			if(tmp == 0) list.remove(list.size()-1);
			else list.add(tmp);
		}
		br.close();
		
		for(int i : list) {
			sum += i;
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		
		
	}
}
