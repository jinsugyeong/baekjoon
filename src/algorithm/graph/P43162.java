package algorithm.graph;

public class P43162 {

    static boolean[] visited;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers ={{1,1,0}, {1,1,0}, {0,0,1}};
        
        solution(n, computers);
    }

    public static int solution(int n, int[][] computers){
        int answer = 0;
        visited = new boolean[n + 1];
        
        for(int i=0; i<n; i++){
            if(visited[i] == false){
                dfs(i, n, computers);
                answer++;
            }
        }


        return answer;
    }

    public static void dfs(int start, int n, int[][] computers){

        visited[start] = true;

        for(int i =0; i<n; i++){
            if(start == i) continue;
            if(computers[start][i] == 1 && visited[i] == false){
                dfs(i,n,computers);
            }
        }
    }
}
