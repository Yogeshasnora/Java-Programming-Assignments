// Assignment 8: Matrices: Transpose and Row Sums
// Use the 3 by 3 matrix with the rows 1 2 3, 4 5 6 and 7 8 9. Print the sum of each row, one line per row,
// in the form Row 1 sum: followed by the total.

public class program_03 {
public static void main(String[] args) {
int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
for (int i = 0; i < 3; i++) {
int sum = 0;
for (int j = 0; j < 3; j++) {
sum = sum + m[i][j];
}
System.out.println("Row " + (i + 1) + " sum: " + sum);
}
}
}
