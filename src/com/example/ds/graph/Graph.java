package com.example.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private int vertexCount;
    private List<List<Integer>> adjacencyListArray;

    public Graph(int v) {
        this.vertexCount = v;
        this.adjacencyListArray = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            this.adjacencyListArray.add(i, new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        this.adjacencyListArray.get(u).add(v);
        this.adjacencyListArray.get(v).add(u);
    }

    public void printGraph() {
        for (int i = 0; i < this.vertexCount; i++) {
            System.out.println(i + "---->" + this.adjacencyListArray.get(i));
        }
    }

    public static void main(String[] args) {
        int V = 6;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        graph.printGraph();
    }

}
