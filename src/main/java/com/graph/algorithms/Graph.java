package com.graph.algorithms;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final int V;
    private final List<List<Integer>> adj;

    public Graph(int V){
        this.V = V;
        this.adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
    }

    public void addUndirectedEdge(int u, int v){
        if(u < 0 || v < 0 || u >= V || v >= V){
            throw new IllegalArgumentException("Invalid vertex index" + u + " or " + v);
        }
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void addDirectedEdge(int u, int v){
        if(u < 0 || v < 0 || u >= V || v >= V){
            throw new IllegalArgumentException("Invalid vertex index " + u + " or " + v);
        }
        adj.get(u).add(v);
    }

    public int getVertexCount(){
        return V;
    }

    public List<Integer> getNeighbours(int u){
        if(u < 0 || u >= V){
            throw new IllegalArgumentException("Invalid vertex index" + u);
        }
        return adj.get(u);
    }



}
