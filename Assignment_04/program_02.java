// Assignment 4: Writing Functions
// Write fact(int n) that returns n factorial using a loop, and nPr(int n, int r) that returns n P r using fact. In
// main, print 5P2 = followed by the result of nPr(5, 2).

public class program_02 {
public static int fact(int n) {
int result = 1;
for (int i = 2; i <= n; i++) {
result = result * i;
}
return result;
}
public static int nPr(int n, int r) {
return fact(n) / fact(n - r);
}
public static void main(String[] args) {
System.out.println("5P2 = " + nPr(5, 2));
}
}
