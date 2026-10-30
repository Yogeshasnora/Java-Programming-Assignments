// Assignment 5: Arrays: Traversal and Counting
// Create an int array named arr with the values 3, 4 and 5. Use a for loop with arr.length to print one line
// for each element: the label Index, the index number, a colon and the element value.

public class program_01 {
public static void main(String[] args) {
int[] arr = {3, 4, 5};
for (int i = 0; i < arr.length; i++) {
System.out.println("Index " + i + ": " + arr[i]);
}
}
}
