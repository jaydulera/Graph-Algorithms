package com.graph.algorithms;

public class DepthFirstSearch {
    private final Graph graph;
    private final boolean[] visited;

    public DepthFirstSearch(Graph graph){
        this.graph = graph;
        this.visited = new boolean[graph.getVertexCount()];
    }

    public void run(int start){
        dfs(start);
    }

    public void dfs(int node){
        visited[node] = true;
        System.out.print(node + " ");
        for(int neighbour: graph.getNeighbours(node)){
            if(!visited[neighbour]){
                dfs(neighbour);
            }
        }
    }
}
