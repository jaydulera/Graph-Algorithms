package com.graph.algorithms;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Graph graph = new Graph(5);
        graph.addUndirectedEdge(0,1);
        graph.addUndirectedEdge(0,2);
        graph.addUndirectedEdge(1,3);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(3,0);
        graph.addUndirectedEdge(4,1);

        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        dfs.run(0);
    }
}