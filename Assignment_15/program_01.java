// Assignment 15: StringBuilder Methods
// Create a StringBuilder that starts with the text Hello. Append the text &quot; World&quot; to it. Print the
// StringBuilder, then print Length: followed by its length.

public class program_01 {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);
System.out.println("Length: " + sb.length());
}
}
