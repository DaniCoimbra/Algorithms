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

# 8. A* Algorithm
  A* algorithm is a search algorithm, that works by using the distance from start and distance from goal, to choose the optimal path. While dijstra considers the distance from start, and a greedy search only considers the distance from target, A* is a mix of both techniques, by adding a heuristic cost to the update calculation. It has the drawback of space efficiency, since the algorithm does not pre-process the graph, and relies of additional data structures to save the path and costs. But does preset optimal efficiency in practical time complexity.
  
  Time Complexity
    Worst Case: O(B ^ D), depth exponential to the branch factor
    Base Case: O((V + E) * log(V))

  Space Complexity: O(V)

# 9. Floyd-Warshall Algorithm
  The Floyd Warshall algorithm is a shortest path algorithm, that calculates the shortest-path problem for every two vertices. By maintaining a matrix of shortest distances between each pair of vertices, it calculates the optimal path lengths by considering intermediate vertices. The algorithm works iteratively, systematically evaluating whether a path through a specific vertex k yields a shorter distance between vertices i and j. This dynamic programming approach enables it to efficiently handle both positive and negative edge weights, and it accounts for potential intermediate paths in the shortest distance calculations. The resulting matrix of shortest path distances provides a comprehensive view of the shortest routes between all pairs of vertices in the graph, making it particularly valuable for scenarios where a global understanding of shortest paths is needed.
  
  Time Complexity
    Base Case: O(V^3)

  Space Complexity: O(V^2)

# 10. Johnson's Algorithm
  The Johnson's algorithm is a shortest path algorithm, that calculates the shortest-path problem for every two vertices. The algorithm uses a combination of BellmanFord and Dijkstra. By adding an extra vertice and applying BellManFord's algorithm to level the edges weightes, all negative edges are properly turned positive. Then, Dijkstra's algorithm is applied to every vertice. This algorithm is more efficient on sparse graphs than Floyd-Warshall's.
  
  Time Complexity
    Base Case: O(V^2 * log(V) + V*E)

  Space Complexity: O(V^2)

# 10. Johnson's Algorithm
  Johnson's algorithm is an all-pairs shortest path algorithm, that works by combining Bellman-Ford and Dijkstra's algorithms. By introducing an additional vertex and applying Bellman-Ford, it transforms negative edge weights into positive values, thus handling them effectively. This pre-processing step levels the playing field. Then, Dijkstra's algorithm is utilized for each vertex, ensuring optimal shortest paths. Notably useful for sparse graphs, Johnson's approach is a favorable alternative to Floyd-Warshall, offering efficiency while comprehensively addressing the shortest-path challenge for all vertex pairs.
  
  Time Complexity
    Base Case: O(V^2 * log(V) + V*E)

  Space Complexity: O(V^2)

# 11. Ford-Fulkerson Algorithm
  The Ford-Fulkerson algorithm computes the maximum flow in a network flow graph. It iteratively augments the flow by discovering augmenting paths from the source to the sink using BFS. By incrementing the flow along these paths, the algorithm effectively finds the maximum amount of flow that can be sent from the source to the sink. This process continues until no more augmenting paths can be found. By using BFS, it ensures that the shortest augmenting paths are explored first, leading to an efficient determination of the maximum flow. This algorithm's adaptability to various flow network sizes and structures makes it a fundamental tool for solving maximum flow problems.
  
  Time Complexity
    Base Case: O(V * E^2)

  Space Complexity: O(V)
