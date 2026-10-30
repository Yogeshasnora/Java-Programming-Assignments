// Assignment 10: Switch and ArrayList
// Create an ArrayList of Integer named list. Add the values 10, 20, 30 and 40. Print the whole list. Then
// print Size: followed by its size, and Item at index 2: followed by the value at index 2.

import java.util.ArrayList;
public class program_02 {
public static void main(String[] args) {

ArrayList<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
System.out.println(list);
System.out.println("Size: " + list.size());
System.out.println("Item at index 2: " + list.get(2));
}
}
