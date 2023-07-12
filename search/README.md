# Searching Algorithms
# 1. Linear Search
  Linear Search is a sequential search algorithm, that fully scan a list in search of an element.
  The algorithm scans and from start to end, checking if the current element is equal to the target. Linear Search does not require the list to be sorted and does not have any extra memory space, but has a slow average and worst case of O(N). That way, it is suitable for unsorted and small datasets.

  Time Complexity
      Best Case: O(1)
      Worst Case: O(N)
      Average Case: O(N)

  Space Complexity: O(1)

# 2. Binary Search 
  Binary Search is a divide and conquer algorithm that repeatedly divides a sorted list based on the target. The algorithm divides the list into low-mid and mid-high, determining which division the target would be in. This process continues until the element is found or no further divisions are possible. 
  Binary Search only works on sorted lists but has a logarithmic time complexity, making it efficient.

  Time Complexity
      Best Case: O(1)
      Worst Case: O(logN)
      Average Case: O(logN)

  Space Complexity: O(1)

# 3. Interpolation Search
  Interpolation Search is an algorithm that assumes data is uniformily distributed, thus the target index is guessed based on that distribution. It uses a formula to estimate the likely position of the target within the list based on the values of the first and last elements. By using this estimation, it narrows down the search range with each iteration.
  pos = low + (target - arr[low]) *(high - low)/(arr[high] - arr[low])
  Interpolation Search works best when the elements in the list are uniformly distributed. It can have a time complexity better than linear search and similar to binary search, with an average and best-case time complexity of O(logN).
  
  Time Complexity
      Best Case: O(1)
      Worst Case: O(N)
      Average Case: O(log(logN))

  Space Complexity: O(1)

# 4. Jump Search
  Jump Search takes √N steps through the array to find the target. Once a jump is larger than the target, it backtracks linearly scanning until target is found. It performs better than linear search, but worst than a logarithmic coomplexity, as it has an O(√N) average case, and only works on sorted lists.
  
  Time Complexity
      Best Case: O(1)
      Worst Case: O(√N)
      Average Case: O(√N)

  Space Complexity: O(1)

# 5. Exponential Search
  Exponential Search looks for the target within an exponential range. After the range is found, i/2-i, a binary search is called on that range. The algorithm has 2 steps, first searching for the target range, then calling binary search, resulting in an O(logN) time complexity. Exponential Search is useful for unbounded/infinite ranged lists. This algorithm requires the list to be sorted.
  
  Time Complexity
      Best Case: O(1)
      Worst Case: O(logN)
      Average Case: O(logN)

  Space Complexity: O(1)

# 6. Ternary Search
  Ternary Search works similarly to a binary search, as a divisive search algorithm, reducing the search range of target on every iteration. Unlike Binary Search, Ternary Search divises the search range into 3, being more efficient on a log base 3. Ternary Algorithm only works on sorted lists, and when compared to binary search, is more efficient, but is not suitable for non-continuous function as it is based on dividing the search space into 3 parts.
  
  Time Complexity
      Best Case: O(1)
      Worst Case: O(log_3 N)
      Average Case: O(log_3 N)

  Space Complexity: O(1)
