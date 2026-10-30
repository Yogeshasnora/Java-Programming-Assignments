// Assignment 2: Decisions and Loops with Numbers
// Use a for loop to find the factorial of 5. Print Factorial of 5 is followed by the value.

public class program_04 {
public static void main(String[] args) {
int fact = 1;
for (int i = 1; i <= 5; i++) {
fact = fact * i;
}
System.out.println("Factorial of 5 is " + fact);
}
}
