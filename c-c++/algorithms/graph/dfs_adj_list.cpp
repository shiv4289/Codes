/*
 * dfs.cpp
 *
 *  Created on: 09-May-2017
 *      Author: shivji
 *
 *  Reference: http://www.geeksforgeeks.org/depth-first-traversal-for-a-graph/
 */


// C++ program to print DFS traversal from a given vertex in a given graph
#include<iostream>
#include<list>
#include<vector>

using namespace std;

// Graph class represents a directed graph using adjacency list representation
class Graph
{
	int V; // No. of vertices
	vector<vector<int> > adj;
	void DFSUtil(int v, vector<bool> &visited); // A function used by DFS
public:
	Graph(int V); // Constructor
	void addEdge(int v, int w); // function to add an edge to graph
	void DFS(int v); // DFS traversal of the vertices reachable from v
	void DFS_disconnected_graph(); // DFS traversal for disconnected graph
};

Graph::Graph(int V)
{
	this->V = V;
	adj.resize(V);
}

void Graph::addEdge(int v, int w)
{
	adj[v].push_back(w); // Add w to v’s list.
}

void Graph::DFSUtil(int v, vector<bool> &visited)
{
	// Mark the current node as visited and print it
	visited[v] = true;
	cout << v << " \n";

	for (unsigned int i = 0; i < adj[v].size(); ++i){
		if (!visited[adj[v][i]])
			DFSUtil(adj[v][i], visited);
	}
}

// DFS traversal of the vertices reachable from v.
// It uses recursive DFSUtil()
void Graph::DFS(int v)
{
	// Mark all the vertices as not visited
	vector<bool>visited(V);
	for (int i = 0; i < V; i++)
		visited[i] = false;

	// Call the recursive helper function to print DFS traversal
	DFSUtil(v, visited);
}

void Graph::DFS_disconnected_graph()
{
    // Mark all the vertices as not visited
    vector<bool>visited(V);
    for (int i = 0; i < V; i++)
        visited[i] = false;

    // Call the recursive helper function to print DFS traversal
    // starting from all vertices one by one
    for (int i = 0; i < V; i++)
        if (visited[i] == false)
            DFSUtil(i, visited);
}

int main()
{
	// Create a graph given in the above diagram
	Graph g(4);
	g.addEdge(0, 1);
	g.addEdge(0, 2);
	g.addEdge(1, 2);
	g.addEdge(2, 0);
	g.addEdge(2, 3);
	g.addEdge(3, 3);

//	cout << "Following is Depth First Traversal (starting from vertex 2) \n";
//	g.DFS(2);

	cout << "\nFollowing is Depth First Traversal for all vertices \n";
	g.DFS_disconnected_graph();

	return 0;
}
