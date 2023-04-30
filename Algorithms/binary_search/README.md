This code takes in an array, its size, and the element to be searched, and returns the index of the element if it is present in the array.
If the element is not present in the array, it returns -1. The algorithm works by repeatedly dividing the search interval in half.
It will start by comparing the middle element of the array with the target element.
If they are equal, it will return the index of the middle element. 
If the target element is less than the middle element, the algorithm will repeat the process on the lower half of the array.
If the target element is greater than the middle element, it will repeat the process on the upper half of the array.