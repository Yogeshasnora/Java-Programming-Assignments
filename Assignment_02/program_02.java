// Assignment 2: Decisions and Loops with Numbers
// Store 83 in an int named marks. Print Grade: followed by A for 90 or more, B for 75 to 89, and C for less
// than 75. Use an else-if ladder.

public class program_02 {
public static void main(String[] args) {
int marks = 83;
if (marks >= 90) {
System.out.println("Grade: A");
} else if (marks >= 75) {
System.out.println("Grade: B");
} else {
System.out.println("Grade: C");
}
}
}
