package step._11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class B2750 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        Set<Integer> s = new TreeSet<>();

        for(int i=0; i<cnt; i++){
            s.add(Integer.parseInt(br.readLine()));
        }

        Iterator<Integer> iter = s.iterator();
        while(iter.hasNext()){
            bw.write(iter.next() + "\n");
        }
        bw.flush();
        bw.close();

        
    }
}
