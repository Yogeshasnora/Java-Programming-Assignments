// Assignment 11: Bubble Sort and Selection Sort
// Create the int array 64, 25, 12, 22, 11. Sort it in increasing order with selection sort. Print Sorted:
// followed by the sorted values in square brackets, separated by commas.

import java.util.Arrays;
public class program_02 {
public static void main(String[] args) {
int[] arr = {64, 25, 12, 22, 11};
for (int i = 0; i < arr.length - 1; i++) {
int minIndex = i;
for (int j = i + 1; j < arr.length; j++) {
if (arr[j] < arr[minIndex]) {
minIndex = j;
}
}
int temp = arr[i];
arr[i] = arr[minIndex];
arr[minIndex] = temp;
}
System.out.println("Sorted: " + Arrays.toString(arr));
}
}
