// Assignment 15: StringBuilder Methods
// Use a StringBuilder. Append each number from 1 to 5, followed by a comma. Then remove the last
// comma with deleteCharAt. Print the result.

public class program_02 {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder();
for (int i = 1; i <= 5; i++) {
sb.append(i);
sb.append(",");
}
sb.deleteCharAt(sb.length() - 1);
System.out.println(sb.toString());
}
}
