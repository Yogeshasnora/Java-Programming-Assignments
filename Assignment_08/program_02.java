// Assignment 8: Matrices: Transpose and Row Sums
// Create the 3 by 3 matrix with the rows 1 2 3, 4 5 6 and 7 8 9. Create its transpose (rows and columns
// swapped). Print the transpose one row per line, with a space after each number.

public class program_02 {
public static void main(String[] args) {
int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int[][] t = new int[3][3];
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
t[j][i] = m[i][j];
}
}
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(t[i][j] + " ");
}
System.out.println();
}
}
}
