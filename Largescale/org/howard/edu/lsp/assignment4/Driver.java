package org.howard.edu.lsp.assignment4;

/**
 * A class to test the functionality of the CustomIntegerSet class.
 */
public class Driver {
  // Creating CustomIntegerSet objects
 IntegerSet set1 = new IntegerSet();
 IntegerSet set2 = new IntegerSet();
 IntegerSet set4 = new IntegerSet();

  /**
   * Main function, the entry point in the program.
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    Driver testObject = new Driver();
    testObject.testingFunc();
  }

  /**
   * Private Testing Function to test all APIs in CustomIntegerSet Class
   */
  private void testingFunc() {
    // Adding elements to set1 and simultaneous testing clear
    set1.addElement(1);
    System.out.println(set1.toString());
    set1.clear();
    System.out.println(set1.toString());
    set1.addElement(7);
    set1.addElement(8);
    set1.addElement(9);

    // Adding elements to set2
    set2.addElement(10);
    set2.addElement(11);
    set2.addElement(12);

    // Testing methods
    System.out.println("Set 1: " + set1.toString());
    System.out.println("Set 2: " + set2.toString());

    System.out.println("Length of set 1: " + set1.size());
    System.out.println("Is set 1 empty? " + set1.isEmpty());

    System.out.println("Does set 1 contain 2? " + set1.containsElement(7));
    System.out.println("Does set 1 contain 4? " + set1.containsElement(12));

    try {
      System.out.println("Largest element in set 4: " + set4.findLargest());
    } catch (IntegerSet.CustomIntegerSetException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println("Largest element in set 1: " + set1.findLargest());
      System.out.println("Smallest element in set 1: " + set1.findSmallest());
    } catch (IntegerSet.CustomIntegerSetException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Union of set 1 and set 2: " + set1.findUnion(set2));
    System.out.println("Intersection of set 1 and set 2: " + set1.findIntersection(set2));
    System.out.println("Difference of set 1 and set 2: " + set1.findDifference(set2));
    System.out.println("Difference of set 2 and set 1: " + set2.findDifference(set1));

    // Removing elements from set1
    set1.removeElement(1);
    System.out.println("Set 1 after removing element 1: " + set1);

    // Testing equals method
    IntegerSet set3 = new IntegerSet();
    set3.addElement(2);
    set3.addElement(3);
    System.out.println("Is set 1 equal to set 3? " + set1.equals(set3));
    System.out.println("Is set 1 equal to set 2? " + set1.equals(set2));
  }
}