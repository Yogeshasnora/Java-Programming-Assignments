// Assignment 12: Insertion Sort
// Create the int array 6, 5, 4, 3, 2, 1. Sort it in increasing order with insertion sort. Count the shifts (each
// time one value moves one place to the right). Print Shifts: followed by the count.

public class program_03 {
public static void main(String[] args) {
int[] arr = {6, 5, 4, 3, 2, 1};
int n = arr.length;
int shifts = 0;
for (int i = 1; i < n; i++) {
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
shifts++;
j--;
}
arr[j + 1] = key;
}
System.out.println("Shifts: " + shifts);
}
}
