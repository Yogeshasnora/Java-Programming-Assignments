// Assignment 13: Strings: Methods and Palindromes
// Reverse the word Java. Build the reversed word one letter at a time, using charAt and + in a loop. Print
// Reversed: followed by the result.

public class program_02 {
public static void main(String[] args) {
String s = "Java";
String rev = "";
for (int i = s.length() - 1; i >= 0; i--) {
rev = rev + s.charAt(i);
}

System.out.println("Reversed: " + rev);
}
}
