// Assignment 5: Arrays: Traversal and Counting
// Create an int array with the values 5, 12, 2, 14 and 7. Use a loop to count the values greater than 10.
// Print Count greater than 10: followed by the count.

public class program_03 {
public static void main(String[] args) {
int[] arr = {5, 12, 2, 14, 7};
int count = 0;
for (int i = 0; i < arr.length; i++) {
if (arr[i] > 10) {
count++;
}
}
System.out.println("Count greater than 10: " + count);
}
}
