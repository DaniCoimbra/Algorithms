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
  
  
    Time Complexity
      Best Case: O(1)
      Worst Case: O(√N)
      Average Case: O(√N)

  Space Complexity: O(1)
