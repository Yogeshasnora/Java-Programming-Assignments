// Assignment 3: Star and Number Patterns
// Print an upside-down triangle of stars with 4 rows. Row 1 has four stars, row 2 has three stars, and so
// on, down to one star in row 4.

public class program_04 {
public static void main(String[] args) {
for (int i = 4; i >= 1; i--) {
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
System.out.println();
}
}
}
