/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/06/21, 9:03 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.graphs;

public class TrainNetwork {
    public static void main(String[] args) {
        Graph trainNetwork = new Graph(true, true);
        Vertex losAngeles = trainNetwork.addVertex("Los Angeles");
        Vertex sanFrancisco = trainNetwork.addVertex("San Francisco");
        Vertex newYork = trainNetwork.addVertex("New York");
        Vertex atlanta = trainNetwork.addVertex("Atlanta");
        Vertex denver = trainNetwork.addVertex("Denver");
        Vertex calgary = trainNetwork.addVertex("Calgary");

        trainNetwork.addEdge(sanFrancisco, losAngeles, 400);
        trainNetwork.addEdge(losAngeles, sanFrancisco, 400);
        trainNetwork.addEdge(newYork, denver, 1800);
        trainNetwork.addEdge(denver, newYork, 1800);
        trainNetwork.addEdge(calgary, denver, 1000);
        trainNetwork.addEdge(denver, calgary, 1000);
        trainNetwork.addEdge(losAngeles, atlanta, 2100);
        trainNetwork.addEdge(atlanta, losAngeles, 2100);

        trainNetwork.removeEdge(denver, calgary);
        trainNetwork.removeEdge(calgary, denver);
        trainNetwork.removeEdge(newYork, denver);
        trainNetwork.removeVertex(calgary);

        trainNetwork.print();
    }
}
