# Sorting Algorithms

# 1. Bubble Sort
  Bubble Sort is a very simple sorting algorithm, it works by repeatedly swapping adjacent elements that are unsorted, until the list is finally sorted. Once no swaps are found in the traverse, the algorithm will return the sorted list. Bubble sort is a stable algorithm, meaning that it preserves the relative order of equal elements. Bubble Sort as a slow average and slow time complexities and has a high number of swaps to achieve a sorted list.
  
  Time Complexity 
    Best Case: O(N) 
    Worst Case: O(N^2) 
    Average Case: O(N^2)
  
  Space Complexity: O(1)

# 2. Selection Sort
  Selection Sort is a consistent sorting algorithm, that works by repeatedly selecting the smaller item from the unsorted portion and placing it to the sorted portion.
The algorithm performs 2 inner traverses, resulting in a O(N^2) time complexity, and does not perform differently if the list is sorted. Selection Sort it is not stable, not preserving the relative order of elements.
  
  Time Complexity 
    Best Case: O(N^2) 
    Worst Case: O(N^2) 
    Average Case: O(N^2)
  
  Space Complexity: O(1)

  
# 3. Insertion Sort
  Insertion Sort is an algorithm that traverses a list, for every item in the unsorted side, it places it in the correct sorted location. Insertion sort will continuously compare the chosen item until found the one smaller, finally placing in the sorted portion. That way, it can perform better for each sorted element in the list, achieving linear time for a fully sorted list, and quadratic on unsorted. Insertion Sort is a stable algorithm.
  
  Time Complexity 
    Best Case: O(N) 
    Worst Case: O(N^2) 
    Average Case: O(N^2)
  
  Space Complexity: O(1)

# 4. Merge Sort
  Merge Sort is a divide and conquer algorithm, that works by breaking the list into smaller pieces and sorting them finally. Thus, it has 2 main phases, merge phase and sort phase. Merge is responsible for the division, continuosly splitting the array into 2 halves. And sort is called on each subarray, merging all of them into a sorted end result. In merge sort, the space complexity is of O(N), as the merged pieces are stored in an auxiliary array.
  Master Theorem: T(n) = 2T(n/2) + O(n)
  
  Time Complexity 
    Best Case: O(N log N) 
    Worst Case: O(N log N) 
    Average Case: O(N log N) 
  
  Space Complexity: O(N)
