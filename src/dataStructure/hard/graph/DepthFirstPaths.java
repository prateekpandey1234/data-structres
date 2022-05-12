package dataStructure.hard.graph;

import java.util.Map;

public class DepthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private Graph<Integer> graph;
    private Map map ;
    private final int s;
    public DepthFirstPaths(Graph<Integer> G, int s){
        marked  = new boolean[G.getVertexCount()];
        edgeTo = new int[G.getVertexCount()];
        graph = G;
        this.s =s;
        dfs(s);
    }

    private void dfs(int v) {
        marked[v] = true;
        for ( int w : graph.map.get(v)){

        }
    }

}
