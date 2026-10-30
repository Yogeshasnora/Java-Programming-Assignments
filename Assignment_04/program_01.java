// Assignment 4: Writing Functions
// Write a function fact(int n) that returns n factorial, using a loop, and a function nCr(int n, int r) that
// returns n C r, using fact. In main, print 5C2 = followed by the result of nCr(5, 2).

public class program_01 {
public static int fact(int n) {
int result = 1;
for (int i = 2; i <= n; i++) {
result = result * i;
}
return result;
}
public static int nCr(int n, int r) {
return fact(n) / (fact(r) * fact(n - r));
}
public static void main(String[] args) {
System.out.println("5C2 = " + nCr(5, 2));
}
}
