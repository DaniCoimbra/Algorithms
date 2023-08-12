# Graph Algorithms

# 1. Depth-First Search (DFS)
  DFS is a graph traversal algorithm that explores all possible paths. It starts at a node and goes as far as possible along each branch before backtracking. It can be implemented using recursion or a stack. The algorithm continuously pick and visit every unvisited adjacent node. DFS can be used on directional, undirectional, weighted and unweighted graphs.

  Time Complexity 
    Base Case: O(V+E)
  
  Space Complexity: O(V + E)

# 2. Breadth-First Search (BFS)
  BFS is a graph searching algorithm that explores all the nodes at the current level before moving to the next level. It uses a queue data structure to keep track of nodes to visit, pushing all adjacent unvisited nodes and continue to search by dequeue and visiting. BFS works for both directed and undirected, but it is designed for unweighted graphs.

  Time Complexity 
    Base Case: O(V+E)
  
  Space Complexity: O(V)

# 3. Dijkstra's Algorithm
  Dijkstra's Algorithm is a single-source shortest path algorithm that finds the shortest path from a given starting node to all other nodes in a weighted graph. It works by iteratively selecting the node with the smallest distance from the source and relaxing its neighboring nodes. The algorithm uses a Priority Queue, to keep track of the nodes with minimum weight, and uses of the update operation to set a new weight to node. The algorithms does not work if a negative weight cycle exists, but works on both directed, undirected and unweighted graphs.
  
  Time Complexity
    Base Case: O((V + E) * log(V))

  Space Complexity: O(V)
  
# 4. Bellman-Ford Algorithm
  Bellman-Ford Algorithm is a single-source shortest path algorithm that finds the shortest path from a given starting node to all other nodes in a weighted graph. It works by performing relaxation of edges iteratively for V-1 times, where V is the number of nodes in the graph. The algorithm maintains an array to keep track of the minimum distance from the source to each node. In each iteration, it examines all edges in the graph and updates the minimum distance for each node if a shorter path is found. The algorithm can handle graphs with negative edge weights, making it more versatile than Dijkstra's Algorithm, but has a slower time complexity.
  
  Time Complexity
    Base Case: O(V * E)

  Space Complexity: O(E)

# 5. Topological Sort
  Topological Sort is a linear ordering of vertices such that for every directed edge (u, v), vertex u comes before vertex v in the ordering. The algorithm achieves its functionality by employing a depth-first search (DFS) approach to traverse the graph. It starts from an arbitrary vertex and explores its neighbors, recursively visiting unvisited vertices. The resulting ordering in the stack represents a valid topological sort of the directed acyclic graph, satisfying the requirement that all outgoing edges from a vertex point to vertices appearing later in the order. This ordering is useful in various applications where the execution order must respect dependencies and constraints among tasks or elements.
  
  Time Complexity
    Base Case: O(V + E)

  Space Complexity: O(V)

# 6. Prim's Algorithm
  Prim's Algorithm is a MST algorithm, that keeps track of the minimum edge that leads to a unvisited node, and adds it to the spanning tree. The algorithm uses a Priority Queue to keep track of the smallest edge, and performs the update operation on the weights.
Prim's Algorithm in applicable for both cyclic, uncyclic graphs.
  
  Time Complexity
    Base Case: O((V + E) * log(V))

  Space Complexity: O(V^2)

# 7. Kruskal’s Algorithm
  Kruskal's Algorithm is a MST algorithm, that works by repeatedly chosing the smallest edge that does not create a cycle. For that, the algorithm sorts the edges by weight and uses of DisjoinSet union-find operations to detect if adding an edge creates a cycle in the spanning tree.
  
  Time Complexity
    Base Case: O(V + E)

  Space Complexity: O(V + E)

