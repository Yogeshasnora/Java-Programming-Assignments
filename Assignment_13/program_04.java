// Assignment 13: Strings: Methods and Palindromes
// Use the word abc. Print every substring of it, one on each line, using substring(). For each starting
// letter from left to right, print its parts from shortest to longest.

public class program_04 {
public static void main(String[] args) {
String s = "abc";
int n = s.length();
for (int i = 0; i < n; i++) {
for (int j = i + 1; j <= n; j++) {
System.out.println(s.substring(i, j));
}
}
}
}
