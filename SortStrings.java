import java.util.*;

public class SortStrings {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  //taking input from user
  System.out.println("Enter the number of strings: ");
  int n = sc.nextInt();
  sc.nextLine();  //consume the newline character

  String[] words = new String[n];
  System.out.println("Enter the Strings: ");
  for(int i = 0; i < n; i++){
     words[i] = sc.nextLine();
  }

  //sorting the array in reverse order and case-insensitive
  Arrays.sort(words, String.CASE_INSENSITIVE_ORDER.reversed());

  //printing the sorted array
  System.out.println("Sorted Strings (Reverse & Case-Insensitive):");
  for(String word : words) {
    System.out.println(word);
  }
  sc.close();

  }

}
