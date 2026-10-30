// Assignment 1: Hello World, Variables and Arithmetic
// Create a constant named PI with the final keyword and the value 3.14. For a circle with radius 7, print
// Area: followed by the area and Perimeter: followed by the perimeter, using PI.

public class program_04 {
public static void main(String[] args) {
final double PI = 3.14;
double radius = 7;
double area = PI * radius * radius;
double perimeter = 2 * PI * radius;
System.out.println("Area: " + area);
System.out.println("Perimeter: " + perimeter);
}
}
