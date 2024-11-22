package TheoryAndTraversal;

import java.util.ArrayList;

public class GraphRepresentation {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        // int adj[][]=new int[n+1][n+1];
        // // edge 1 --- 2
        // adj[1][2] = 1;
        // adj[2][1] = 1;

        // // edge 2 --- 3
        // adj[2][3]=1;
        // adj[3][2]=1;

        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }

        //edge 1 -- 2
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        
    }
}