// Assignment 7: Counting Steps and Complexity
// Use two loops, one inside the other, that both run from 1 to 10. Count how many times the inner loop
// body runs. Above the loops, write a comment with their time complexity. Print Steps: followed by the total.

public class program_02 {
public static void main(String[] args) {
int steps = 0;
// Time complexity: O(n * n), two nested loops of n runs each (here n = 10).
for (int i = 1; i <= 10; i++) {
for (int j = 1; j <= 10; j++) {
steps++;
}
}
System.out.println("Steps: " + steps);
}
}
