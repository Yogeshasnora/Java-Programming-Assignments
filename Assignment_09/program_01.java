// Assignment 9: Matrices: Rows and Columns
// Use the 3 by 3 matrix with rows 1 2 3, 4 5 6 and 7 8 9. Print First row: and its values, then Last row: and
// its values, with a space between values.

public class program_01 {
public static void main(String[] args) {
int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
System.out.print("First row:");
for (int j = 0; j < 3; j++) {
System.out.print(" " + m[0][j]);
}
System.out.println();
System.out.print("Last row:");
for (int j = 0; j < 3; j++) {
System.out.print(" " + m[2][j]);
}
System.out.println();
}
}
