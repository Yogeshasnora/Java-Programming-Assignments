// Assignment 3: Star and Number Patterns
// Print a right triangle of stars with 4 rows. Row 1 has one star, row 2 has two stars, and so on.

public class program_02 {
public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
}
    System.out.println();
}
}
}
