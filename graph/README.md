# Graph Algorithms

# 1. Depth-First Search (DFS)
  DFS is a graph traversal algorithm that explores all possible paths. It starts at a node and goes as far as possible along each branch before backtracking. It can be implemented using recursion or a stack. The algorithm continuously pick and visit every unvisited adjacent node.

  Time Complexity 
    Base Case: O(V+E)
  
  Space Complexity: O(V + E)

# 2. Breadth-First Search (BFS)
  BFS is a graph searching algorithm that explores all the nodes at the current level before moving to the next level. It uses a queue data structure to keep track of nodes to visit, pushing all adjacent unvisited nodes and continue to search by dequeue and visiting.

  Time Complexity 
    Base Case: O(V+E)
  
  Space Complexity: O(V)

# 3. Dijkstra's Algorithm
  Dijkstra's Algorithm is a single-source shortest path algorithm that finds the shortest path from a given starting node to all other nodes in a weighted graph. It works by iteratively selecting the node with the smallest distance from the source and relaxing its neighboring nodes. The algorithm uses a Priority Queue, to keep track of the nodes with minimum weight, and uses of the update operation to set a new weight to node.
  Time Complexity
    Base Case: O((V + E) * log(V))

  Space Complexity: O(V)

