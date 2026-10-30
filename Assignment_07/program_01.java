// Assignment 7: Counting Steps and Complexity
// Use one loop that runs from 1 to 10, and count its steps. Above the loop, write a comment with its
// time complexity. Print Steps: followed by the number of steps.

public class program_01 {
public static void main(String[] args) {
int steps = 0;
// Time complexity: O(n), one loop that runs n times (here n = 10).
for (int i = 1; i <= 10; i++) {
steps++;
}
System.out.println("Steps: " + steps);
}
}
