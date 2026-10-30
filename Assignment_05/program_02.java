// Assignment 5: Arrays: Traversal and Counting
// Create an int array with the values 12, 45, 7, 33 and 21. Use a loop to find the sum and the largest
// value. Print Sum: followed by the sum, then Largest: followed by the largest value.

public class program_02 {
public static void main(String[] args) {
int[] arr = {12, 45, 7, 33, 21};
int sum = 0;
int largest = arr[0];
for (int i = 0; i < arr.length; i++) {
sum = sum + arr[i];
if (arr[i] > largest) {
largest = arr[i];
}
}
System.out.println("Sum: " + sum);

System.out.println("Largest: " + largest);
}
}
