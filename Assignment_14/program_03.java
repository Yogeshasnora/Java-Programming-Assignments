// Assignment 14: Characters: Counting and Positions
// Store hello in a String named s. Print each letter on its own line as its position, a colon, a space and the
// letter. Positions start at 0.

public class program_03 {
public static void main(String[] args) {
String s = "hello";
for (int i = 0; i < s.length(); i++) {
System.out.println(i + ": " + s.charAt(i));
}
}
}
