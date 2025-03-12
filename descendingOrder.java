import java.util.Scanner;

public class descendingOrder {
  public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     
     //Array size info from user
     System.out.print("Enter the length of the array : ");
     int n = sc.nextInt();
     int[] arr = new int[n];

    // Take array input from the user
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n ; i++) {
    arr[i] = sc.nextInt();
    
    }
    // perform selection sort in descending order
    selectionSortDescending(arr);

    // print the sorted array
    System.out.print("Sorted  Array in Descending Order: "); 
    for(int num : arr) {
        System.out.print(num + " ");
    }
    sc.close();
  }

  public static void selectionSortDescending(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n; i++){
   //Assume the max element is at position i
   int maxIndex = i;
   for(int j = i + 1; j < n; j++){
    if(arr[j] > arr[maxIndex]){   //In Java, to access an array element, you use square brackets [], not parentheses ().
        maxIndex = j;
    }
   }
   //Swap the found max element with the first element 
   int temp = arr[maxIndex];
   arr[maxIndex] = arr[i];
   arr[i] = temp;
    }
  }


}