# The Sort Manager

## Table of Contents

* Program Description
* User Manual
* Initial Specification
* Algorithms

## Program Description

A program to generate an array of random integers of a size specified by the user. 
The array will then be sorted according to which algorithm the user chooses from a
list. The program will then output the unsorted and sorted versions of the array,
as well as the time it took to sort their array in nanoseconds.

## User Manual
Upon running the program, the user will be presented with an interface. At the top
there will be a text field containing "How many ints?". In this field the user should
input the size of the array they wish to generate. There are radio buttons with the names
of the available sorting algorithms. The user should click which algorithm they wish to use
(can only click one). The user should then click the button labelled "Generate and sort".

Below this, there are two text areas and a label. Upon clicking the button, the top area
will be filled with the unsorted array, and the lower text area will hold the sorted version.
Between these, the user will see a label that tells them how long the sorting took.

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