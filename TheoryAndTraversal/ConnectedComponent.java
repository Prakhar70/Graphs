package TheoryAndTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectedComponent {
    public int findNumberOfComponent(int E, int V, List<List<Integer>> edges) {

        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            graph[edges.get(i).get(0)].add(edges.get(i).get(1));
            graph[edges.get(i).get(1)].add(edges.get(i).get(0));
        }
        boolean[] vis = new boolean[V];

        int cnt = 0;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, vis, i);
                cnt++;
            }
        }
        return cnt;
    }

    private void dfs(ArrayList<Integer>[] graph, boolean[] vis, int i) {
        Queue<Integer> que=new LinkedList<>();
        que.add(i);
        
        while(que.size()>0){
            int size=que.size();
            while(size-->0){
                int rNode = que.remove();
                vis[rNode]=true;
                for(int adjVertices:graph[rNode]){
                    if(vis[adjVertices]==false)
                        que.add(adjVertices);
                }
            }
        }
        
    }

}
