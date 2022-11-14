package algorithm.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class B15956 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "&&");
		
		Map<String,List<String>> tMap = new HashMap<>();
		Map<String,List<String>> fMap = new HashMap<>();
		List<String> tempList = null;
		String temp = null;
		int idx = 0;
		
		while(st.hasMoreTokens()) {
			temp = st.nextToken();
			if(temp.indexOf("==") > 0) {
				idx = temp.indexOf("==");
				String key = temp.substring(0, idx);
				String value = temp.substring(idx+2);
				
				if(tMap.get(key) == null) {
					tempList = new ArrayList<>();
					tempList.add(value);
				}else {
					tMap.get(key).add(value);
				}
				
				tMap.put(key, tempList);
				
				
				continue;
			}
			
			if(temp.indexOf("!=") > 0){
				idx = temp.indexOf("!=");
				
				String key = temp.substring(0, idx);
				String value = temp.substring(idx+2);
				
				if(tMap.get(key) == null) {
					tempList = new ArrayList<>();
					tempList.add(value);
				}else {
					fMap.get(key).add(value);
				}
				
				fMap.put(key, tempList);
				
				continue;
			}
		}
		
		System.out.println(tMap);
		System.out.println(fMap);
		
		//변수이름 = 알파벳, 변수값 = 정수
		//a == b, 같으면 true, 다르면 false
		//a != b, 다르면 true, 같으면 false      -->a,b는 무조건 단항식(변수or정수)
		// &&로 논리식 1개 이상만들기
	}

}
