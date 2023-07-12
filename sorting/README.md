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
  Merge Sort is a divide and conquer algorithm, that works by breaking the list into smaller pieces and sorting them finally. Thus, it has 2 main phases, merge phase and sort phase. Merge is responsible for the division, continuosly splitting the array into 2 halves. And sort is called on each subarray, merging all of them into a sorted end result. In merge sort, the space complexity is of O(N), as the merged pieces are stored in an auxiliary array. Merge Sort is a stable sorting algorithm.
  
  Master Theorem: T(n) = 2T(n/2) + O(n)
  
  Time Complexity 
    Best Case: O(N log N) 
    Worst Case: O(N log N) 
    Average Case: O(N log N) 
  
  Space Complexity: O(N)

# 5. Quick Sort
  Quick Sort is a divide and conquer algorithm, that works by continuosly selecting a pivot value, then recursively partitioning around the pivot, sorting elements larger and smaller than the pivot. The efficiency of QuickSort is depends on the pivot choice, a bad choice can lead to an O(N^2) complexity, while an ideal choice can achieve O(N log N). Some pivot choices are: First element, middle element, last element, random element. 
  Because in quicksort, recursion happens after partition, tail recursion optimization can be applied, thus converting the stack call overhead to a loop.
  
  Master Theorem: T(n) = 2T(n/2) + O(n)
  
  Time Complexity 
    Best Case: O(N log N) 
    Worst Case: O(N log N) 
    Average Case: O(N log N) 
  
  Space Complexity: O(N)

# 6. Count Sort
  Count Sort is a non comparison sorting algorithm, it works by counting the number of distinctive objects, then calculating their designed position. First a count array storing the number of occurences for each element is created. Then, the calculate the cumulative sum of the counts on a modified array. Finally, build the output sorted array, by accessing the corresponding index in the sorted array using the count of each element as the index, then decrementing the count to handle duplicate elements. Since counting sort depends on N, the size of the array, and K, the range of values, the complexity will rely on both factors as O(N + K). Count Sort is a stable sorting algorithm, that uses one auxiliary array of memory O(N + K). Thus, this sort technique is effective if range is not significantly larget than N.
    
  Time Complexity 
    Best Case: O(N + K) 
    Worst Case: O(N + K) 
    Average Case: O(N + K) 
  
  Space Complexity: O(N + K)

# 7. Radix Sort
  Radix Sort is a non comparison sorting algorithm, that works by sorting an array based on the digit, from the lowest digit. Radix Sort uses counting sort to provide a sorting operation for each digit, this, for each digit, a count sort is executed, resulting in a time complexity of O(D * (N + K)), and an auxiliary memory of O(N + K). The use of count sort as underlying sorting algorithm provides a stable sorting. Thus, this sorting algorithm effectiveness is tied to the digits and range of dataset.
    
  Time Complexity 
    Best Case: O(D * (N + K))
    Worst Case: O(D * (N + K))
    Average Case: O(D * (N + K))
  
  Space Complexity: O(N + K)

# 8. Shell Sort
  Shell Sort is a comparison sorting algorithm, like insertion sort, it works by moving an unsorted element to the sorted position, but shellsort does a gap interval, instead of linearly. In shellsort the gap reduction choice heavily affect the time complexity of the algorithm. While in worst case, it performs O(N^2), and best case the array will divide without the swap, thus resulting in O(log N). The average case on most gap sequences, is of O(N LOG N) to O(N LOG^2 N). Despite the logarithmic behavior, this algorithm can perform without recursion, thus reducing the stack overhead.
    
  Time Complexity 
    Best Case: O(log N)
    Worst Case: O(N^2)
    Average Case: O(N LOG N)
  
  Space Complexity: O(1)

# 9. Comb Sort
  Comb Sort is a comparison sorting algoritm, working similarly to bubble sort, but elements are compared in a gap size larger than 1, that starts large and shrinks by a 1.3 factor. The algorithm works on p increments, and is highly affected by p. Having a worst case of O(N^2), where every value is compared to every other value, a best case of O(N log N), where the comparison loop is called once. Finally the average case is of O(N^2 / 2^p).

  Time Complexity 
    Best Case: O(N log N)
    Worst Case: O(N^2)
    Average Case: O(N^2 / 2^p)
  
  Space Complexity: O(1)

# 10. TimSort
  TimSort is a comparison algorithm, combining merge and insertion sort. It defines a run size, of which the array will be divided into, then run insertion sort on the runs, then, merge the runs to a whole, after, the run size is adjusted to continue the merge until sorted. This algorithm is highly efficient, as it maintains a linear best case complexity and an O(N log N) average and worst case, as well as being a stable algorithm.

  Time Complexity 
    Best Case: O(N)
    Worst Case: O(N log N)
    Average Case: O(N log N)
  
  Space Complexity: O(N)
