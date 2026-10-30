// Assignment 14: Characters: Counting and Positions
// Store programming in a String named s. Count how many times the letter g appears. Print Count of g:
// followed by the count.

public class program_02 {
public static void main(String[] args) {
String s = "programming";
int count = 0;
for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == 'g') {
count++;
}
}
System.out.println("Count of g: " + count);
}
}
