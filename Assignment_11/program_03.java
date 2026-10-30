// Assignment 11: Bubble Sort and Selection Sort
// Use the array 5, 1, 4, 2, 8 and sort it with bubble sort. Count the swaps (each time two values change
// places). Print Swaps: followed by the count.

public class program_03 {
public static void main(String[] args) {
int[] arr = {5, 1, 4, 2, 8};
int n = arr.length;
int swaps = 0;
for (int pass = 1; pass <= n - 1; pass++) {
for (int j = 0; j < n - pass; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
swaps++;
}
}
}
System.out.println("Swaps: " + swaps);
}

}
