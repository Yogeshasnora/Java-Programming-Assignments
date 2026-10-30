// Assignment 3: Star and Number Patterns
// Print a number triangle with 4 rows. Row 1 prints 1. Row 2 prints 1 2. Row 3 prints 1 2 3, and so on. Put
// a space after each number.

public class program_03 {
public static void main(String[] args) {
for (int i = 1; i <= 4; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(j + " ");
}
System.out.println();
}
}
}
