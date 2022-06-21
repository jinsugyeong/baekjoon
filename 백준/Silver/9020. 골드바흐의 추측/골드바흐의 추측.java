import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static boolean[] prime = new boolean[10001];
    
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        get_prime();

        int cnt = Integer.parseInt(br.readLine());

        while(cnt--> 0){
            int num = Integer.parseInt(br.readLine());
            int p = num / 2;
            int q = num / 2;

            while(true){
                if(!prime[p] && !prime[q]) {
                    bw.write(p+" "+q+"\n");
                    break;
                }
                p--;
                q++;
            }
        }

        bw.flush();
        bw.close();
    }

    static void get_prime(){
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            
            for (int j=i*i; j<prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}