/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 15/06/21, 9:10 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.graphs;

import java.util.ArrayList;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputData) {
        this.data = inputData;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        this.edges.add(new Edge(this, endVertex, weight));
    }

    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public String getData(){
        return this.data;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    public void print(boolean showWeight){
        String message = "";
        if(this.edges.size()==0){
            System.out.println(this.data+" --> "+ "Nowhere");
            return;
        }
        for (int i = 0; i < this.edges.size(); i++) {
            if (i==0){
                message += this.edges.get(i).getStart().data + " --> ";
            }
            message += this.edges.get(i).getEnd().data;
            if (showWeight){
                message += " ("+this.edges.get(i).getWeight()+")";
            }
            if (i != this.edges.size() - 1){
                message += ", ";
            }
        }
        System.out.println(message);
    }
}
