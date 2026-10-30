// Assignment 6: Arrays: Reverse and Duplicates
// Create an int array with the values 2, 5, 1, 8, 3 and 4. Use a loop to find the smallest value and its
// index. Print Smallest: followed by the value, then the words at index and the index.

public class program_02 {
public static void main(String[] args) {
int[] arr = {2, 5, 1, 8, 3, 4};

int smallest = arr[0];
int index = 0;
for (int i = 1; i < arr.length; i++) {
if (arr[i] < smallest) {
smallest = arr[i];
index = i;
}
}
System.out.println("Smallest: " + smallest + " at index " + index);
}
}
