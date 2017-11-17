package org.algorithms.datastructures;

import java.util.Iterator;
import java.util.LinkedList;

class Graph {
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists

	// Constructor
	Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	// prints BFS traversal from a given source s
	void BFS(int s) {
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[V];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	void printGraph() {

		for (int v = 0; v < V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : adj[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}

	}

	// A function used by DFS
	private void DFSRecursion(int v, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSRecursion(n, visited);
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v) {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean[] visited = new boolean[V];

		// Call the recursive helper function to print DFS traversal
		DFSRecursion(v, visited);
	}

	public boolean isCyclic() {
		boolean[] visited = new boolean[V];
		boolean[] recStack = new boolean[V];
		for (int i = 0; i < V; i++) {
			visited[i] = false;
			recStack[i] = false;
		}

		// Call the recursive helper function to detect cycle in different
		// DFS trees
		for (int i = 0; i < V; i++)
			if (isCyclicRecursion(i, visited, recStack))
				return true;

		return false;
	}

	private boolean isCyclicRecursion(int i, boolean[] visited, boolean[] recStack) {
		if (visited[i] == false) {
			// Mark the current node as visited and part of recursion stack
			visited[i] = true;
			recStack[i] = true;

			// Recur for all the vertices adjacent to this vertex
			Iterator<Integer> iter = adj[i].listIterator();
			while (iter.hasNext()) {
				int n = iter.next();
				if (!visited[n] && isCyclicRecursion(n, visited, recStack))
					return true;
				else if (recStack[n])
					return true;
			}

		}
		recStack[i] = false; // remove the vertex from recursion stack
		return false;
	}

}