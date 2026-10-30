// Assignment 8: Matrices: Transpose and Row Sums
// Create a matrix named m with 3 rows and 4 columns. Fill it with the values 1 to 12, row by row, using
// nested loops. Print the matrix one row per line, with a space after each number.

public class program_01 {
public static void main(String[] args) {
int[][] m = new int[3][4];
int value = 1;
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 4; j++) {
m[i][j] = value;
value++;

}
}
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 4; j++) {
System.out.print(m[i][j] + " ");
}
System.out.println();
}
}
}
