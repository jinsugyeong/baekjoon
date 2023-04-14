package swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S1859 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		int N=0, max=0;
		long sum = 0;
		int[] arr = null;
		
		for(int i=1; i<=T; i++) {
			bw.write("#" + i + " ");
			
			N = Integer.parseInt(br.readLine());
			max = 0;
			sum = 0;
			
			arr = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=N-1; j>=0; j--) {
				if(arr[j]>max) max=arr[j];
				sum += max - arr[j];
			}
			bw.write(sum+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
