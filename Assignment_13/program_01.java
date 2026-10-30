// Assignment 13: Strings: Methods and Palindromes
// Use the word Programming. Print Length: followed by its length, Position of g: followed by the position
// of the first g (counting from 0), and Upper case: followed by the word in capital letters, using toUpperCase().

public class program_01 {
public static void main(String[] args) {
String word = "Programming";
System.out.println("Length: " + word.length());
System.out.println("Position of g: " + word.indexOf('g'));
System.out.println("Upper case: " + word.toUpperCase());
}
}
