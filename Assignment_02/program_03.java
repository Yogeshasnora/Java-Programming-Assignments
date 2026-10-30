// Assignment 2: Decisions and Loops with Numbers
// Store 2024 in an int named year. A leap year is divisible by 4 but not by 100, or divisible by 400. Print
// Leap year for a leap year, otherwise Not a leap year.

public class program_03 {
public static void main(String[] args) {
int year = 2024;
boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
if (leap) {
System.out.println("Leap year");
} else {
System.out.println("Not a leap year");
}
}
}
