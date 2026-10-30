// Assignment 9: Matrices: Rows and Columns
// Use the 3 by 3 matrix with the rows 1 2 3, 4 5 6 and 7 8 9. Print the sum of each column, one line per
// column, in the form Column 1 sum: followed by the total.

public class program_02 {
public static void main(String[] args) {
int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
for (int j = 0; j < 3; j++) {
int sum = 0;
for (int i = 0; i < 3; i++) {
sum = sum + m[i][j];
}
System.out.println("Column " + (j + 1) + " sum: " + sum);
}
}
}
