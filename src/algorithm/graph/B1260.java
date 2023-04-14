package algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class B1260{
    static ArrayList<Integer>[] connections;
    static boolean[] visited; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        connections = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for(int i = 1; i<=n; i++){
            connections[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            connections[x].add(y);
            connections[y].add(x);
        }

        for(int i=1; i<=n; i++){    //정렬
            Collections.sort(connections[i]);
        }

        dfs(v); 
        //visited 배열 초기화해주기
        //visited = new ArrayList[n + 1];
        System.out.println();
        Arrays.fill(visited, false);
        bfs(v);
    }

    public static void dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        for(int i : connections[node]){
            if(visited[i] == false){
                dfs(i);
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");

            for(int i : connections[node]){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}

