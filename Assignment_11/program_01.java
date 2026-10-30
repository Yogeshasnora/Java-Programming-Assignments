// Assignment 11: Bubble Sort and Selection Sort
// Create the int array 5, 1, 4, 2, 8. Sort it in increasing order with bubble sort. Print Sorted: followed by
// the sorted values in square brackets, separated by commas.

import java.util.Arrays;
public class program_01 {
public static void main(String[] args) {
int[] arr = {5, 1, 4, 2, 8};
for (int pass = 1; pass < arr.length; pass++) {
for (int j = 0; j < arr.length - pass; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];

arr[j + 1] = temp;
}
}
}
System.out.println("Sorted: " + Arrays.toString(arr));
}
}
