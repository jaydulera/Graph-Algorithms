package com.graph.algorithms;

import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstSearch {
    private final Graph graph;
    private final boolean[] visited;

    public BreadthFirstSearch(Graph graph){
        this.graph = graph;
        this.visited = new boolean[graph.getVertexCount()];
    }

    public void run(int start){
        bfs(start);
    }

    public void bfs(int root){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        visited[root] = true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(" " + node);
            for(int neighbour: graph.getNeighbours(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }
}
