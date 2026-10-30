// Assignment 12: Insertion Sort
// Create the int array 14, 3, 9, 21, 6. Sort it in increasing order with insertion sort. Print Sorted: followed
// by the sorted values in square brackets, separated by commas.

import java.util.Arrays;
public class program_02 {
public static void main(String[] args) {
int[] arr = {14, 3, 9, 21, 6};
for (int i = 1; i < arr.length; i++) {
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
System.out.println("Sorted: " + Arrays.toString(arr));
}
}
