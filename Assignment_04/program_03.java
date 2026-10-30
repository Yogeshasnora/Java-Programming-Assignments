// Assignment 4: Writing Functions
// Write maxOf(int a, int b) that returns the larger of its two int values. In main, print Larger: followed by
// the result of maxOf(14, 9).

public class program_03 {
public static int maxOf(int a, int b) {
if (a > b) {
return a;
}
return b;
}
public static void main(String[] args) {
System.out.println("Larger: " + maxOf(14, 9));
}
}
