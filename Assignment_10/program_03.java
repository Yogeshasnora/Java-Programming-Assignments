// Assignment 10: Switch and ArrayList
// Create an ArrayList of Integer named list with the values 10, 20, 30 and 40. Use set to change index 1
// to 25, and remove to delete index 3. Print the list and Size: followed by its size.

import java.util.ArrayList;
public class program_03 {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.set(1, 25);
list.remove(3);
System.out.println(list);
System.out.println("Size: " + list.size());
}
}
