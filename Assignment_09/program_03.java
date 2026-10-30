// Assignment 9: Matrices: Rows and Columns
// Use the 3 by 3 matrix with the rows 1 2 3, 4 5 6 and 7 8 9. Count the values greater than 5 and print
// Values greater than 5: followed by the count.

public class program_03 {
public static void main(String[] args) {
int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int count = 0;
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
if (m[i][j] > 5) {
count++;
}
}
}
System.out.println("Values greater than 5: " + count);
}
}
