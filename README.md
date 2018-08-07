# BasicSort

## Class notes:

Amongst sorting algorithm:
-> most are n^2
-> some grow n log n (Is usually slightly above linear for beginning, but drops down for larger data sets).

Classic slow algorithm: Bubble sort
Example:
[44,55,94,6,67,100,14]
Compares adjacent pairs. If right position relative to each other, if wrong, swap them.
[44,55,6,94,67,100,14]
[44,55,6,67,94,100,14]
...
Each full pass is one iteration.
data set movement/full iterations is 6. (length - 1)
Each pass largest number will be on rightmost side. -> https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif

a = [i,i+1, ..., n-2, n-1]
```
//then repeat for all of them
for(int j = 0; j < a.length - 1; j++){ //you will always have the largest item be at the end.
	//comparison for each first coded
	for(int i = 0; i < a.length - 1; i++) { //n - 2 as final comparison will we be n + 2 (n- 1)
		if(a[i] > a[i+1]) { //swap them aroudn
			int temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
	}
}
```

//worst case: O(n^2) -> due to double loop. Comparisons and swaps
//best case: O(n) comparisons. O(1) swaps
//average is worst case.
//N.B. O(n-1)^2 is the same as O(n^2). Due to O(n-1)^2 = (n-1)(n-1) = n^2 - 2n + 1. Due to size of it, you can practically ignore -2n + 1, therefore O(n^2). Only highest power counts.
//for Big O, any constants fall away, even for dividing. Even linear being n/2, it is still O(n) as constant falls away.


Moved on to class code.


What makes insert sort faster than bubble and selection sort? Having to go through entire array. Big O same but: 
> Insertion Sort swaps a value up into already-sorted values, stopping at the right place.
>> Once a pass starts, Bubble Sort must see it through to the end. Insertion bails early. They’re both Adaptive, as they both sense when they don’t need another pass.

Quick sort:
pivot in n/2. go both left and right side. From leftmost of pivot to right.
