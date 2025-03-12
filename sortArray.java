import java.util.*;

public class sortArray {
  public static void main(String[] args){
  String[] words = {"banana", "apple", "cherry", "mango", "blueberry"};

  // Sorting the array alphabetically
  Arrays.sort(words);
  
  // Printing the sorted array
  System.out.println("Sorted String: ");
  for(String word : words) {
    System.out.println(word);
  }
  

  }

}