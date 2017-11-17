package org.algorithms.datastructures;

public class GraphTesting {

	public static void main(String[] args) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		// g.addEdge(3, 1);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.BFS(0);
		System.out.println();
		g.DFS(0);
		System.out.println();
		System.out.println(g.isCyclic());
		// g.printGraph();

	}

}
