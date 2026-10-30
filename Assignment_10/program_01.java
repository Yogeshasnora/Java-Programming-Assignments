// Assignment 10: Switch and ArrayList
// Store 3 in an int named day. Use a switch statement to print the name of the day: 1 is Monday, 2 is
// Tuesday and 3 is Wednesday. For any other number, print Invalid day.

public class program_01 {
public static void main(String[] args) {
int day = 3;
switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
default:
System.out.println("Invalid day");
}
}
}
