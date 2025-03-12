import java.util.Scanner;

public class bubbleDescending{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  // ask the user for the array size
  System.out.print("Enter the number of elements: ");
  int n = sc.nextInt();
  int[] arr = new int[n];

  // take array input from the user
  System.out.println("Enter the elements: ");
  for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt(); 
  }
  //perform bubble sort
  bubbleSort(arr);

  //print the sorted array
  System.out.print("Sorted Array: ");
  for (int num : arr){  // The enhanced for-loop syntax is for (datatype variable : array) to iterate through each element.
    System.out.print(num + " ");
  }
  sc.close();
  }

public static void bubbleSort(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
        boolean swapped = false;
        for(int j = 0; j < n - i - 1; j++){
          if(arr[j] < arr[j + 1]){
            //swap arr[j] and arr[j+1]
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            swapped = true;
          }  
        }
        //if no swaps happened, the array is already sorted 
        if (!swapped) {
            break;
        }
    }
}  



}