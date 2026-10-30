// Assignment 14: Characters: Counting and Positions
// Store programming in a String named s. Count its vowels (a, e, i, o and u). Print Vowels: followed by
// the count.

public class program_01 {
public static void main(String[] args) {
String s = "programming";
int count = 0;
for (int i = 0; i < s.length(); i++) {
char c = s.charAt(i);
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
count++;
}
}
System.out.println("Vowels: " + count);
}
}
