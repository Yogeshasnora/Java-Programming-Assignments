// Assignment 7: Counting Steps and Complexity
// Store 1024 in an int named n. Use a while loop that halves n until n is 1, and count the divisions. Above
// the loop, write a comment with its time complexity. Print Halving steps: followed by the count.

public class program_03 {
public static void main(String[] args) {
int n = 1024;
int count = 0;
// Time complexity: O(log n), because n is halved each time.
while (n > 1) {
n = n / 2;
count++;
}
System.out.println("Halving steps: " + count);
}
}
