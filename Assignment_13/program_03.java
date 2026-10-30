// Assignment 13: Strings: Methods and Palindromes
// Use the word racecar. Check whether it is a palindrome, which means it reads the same from both
// ends. Print the word followed by is a palindrome, or followed by is not a palindrome.

public class program_03 {
public static void main(String[] args) {
String s = "racecar";
int n = s.length();
boolean ok = true;
for (int i = 0; i < n / 2; i++) {
if (s.charAt(i) != s.charAt(n - 1 - i)) {
ok = false;
}
}
if (ok) {
System.out.println(s + " is a palindrome");
} else {
System.out.println(s + " is not a palindrome");
}
}
}
