# The Sort Manager

## Table of Contents

* [Initial Specification](Initial-Specification)
* [Algorithms](algorithms)


## Initial Specification

You will be building a program that will allow a user to sort a randomised array. The general flow of the application is:
1. The user is presented with a number of sort algorithms to choose from
2. Decision is given via the command line (Scanner)
3. The program will then ask for the length of an array again via the command line (Scanner)
4. The program should then output:
- The unsorted randomly generated array
- The sort algorithm to be used
- The sorted array after the algorithm has been executed
- The time taken

You are required to test both the functionality of the program and the performance of the algorithms (speed tests)

## Algorithms

### -Bubble Sort

Bubble sort repeatedly looks through a set of data like a list or 
array. Each look will compare element 0 with 1, then 1 with 2 and 
so on until the end of the list.

At the end of each loop through the list, we check to see if the data
is now in the correct order, or if we need to look through and keep sorting.

Bubble sort has a big O notation of O(n^2)

### -Binary Sort

Binary sort works by adding the elements of the list to a binary tree
structure, and then returning the tree as a list to give a naturally ordered
dataset.

Building the tree can be quite slow, but once created, sorting the data is no 
longer a concern because it stays sorted.

### -Merge Sort

Merge sort is a recursive divide-and-conquer algorithm. A list is
separated into halves recursively until we have just individual elements,
and then we merge the elements back together in order.