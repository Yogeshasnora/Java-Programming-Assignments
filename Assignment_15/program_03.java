// Assignment 15: StringBuilder Methods
// Create a StringBuilder that starts with the text Java. Use insert to add the text Hello followed by a
// space at index 0. Print the StringBuilder.

public class program_03 {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Java");
sb.insert(0, "Hello ");
System.out.println(sb);
}
}
