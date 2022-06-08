package step._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B3052 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //HashSet은 순서가 없고 중복없이 저장하는 성질이 있음
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<10; i++){
            hs.add(Integer.parseInt(br.readLine())%42);
        }
        br.close();
        System.out.println(hs.size());

    }
}
