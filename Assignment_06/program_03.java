// Assignment 6: Arrays: Reverse and Duplicates
// Create an int array with the values 4, 9, 2, 9 and 7. Use nested loops to check for a repeated value.
// Print Repeated value: followed by it, or print No repeated value if none is repeated.

public class program_03 {
public static void main(String[] args) {
int[] arr = {4, 9, 2, 9, 7};
boolean found = false;
for (int i = 0; i < arr.length; i++) {
for (int j = i + 1; j < arr.length; j++) {
if (arr[i] == arr[j]) {
found = true;
System.out.println("Repeated value: " + arr[i]);
}
}
}
if (!found) {
System.out.println("No repeated value");
}
}
}
