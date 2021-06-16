/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 15/06/21, 9:11 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.graphs;

public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex startV, Vertex endV, Integer inputWeight) {
        this.start = startV;
        this.end = endV;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return this.start;
    }

    public Vertex getEnd() {
        return this.end;
    }

    public Integer getWeight() {
        return this.weight;
    }
}
