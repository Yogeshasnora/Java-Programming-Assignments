// Assignment 6: Arrays: Reverse and Duplicates
// Create an int array with the values 10, 20, 30, 40 and 50. Print the values in reverse order, one value on
// each line, starting with the last value.

public class program_01 {
public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};
for (int i = arr.length - 1; i >= 0; i--) {
System.out.println(arr[i]);
}
}
}
