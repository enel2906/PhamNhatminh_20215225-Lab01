import java.util.Scanner;

class Arrays{
      public void toString(int[] arr){
            for(int i = 0;i<arr.length;i++){
                  for(int j = i+1;j<arr.length;j++){
                        if(arr[i]>arr[j]){
                              int temp = arr[i];
                              arr[i] = arr[j];
                              arr[j] = temp;
                        }
                  }
            }
            for(int i = 0;i<arr.length;i++){
                  System.out.print(arr[i]+" ");
            }
      }
}



public class array {

      
      public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: "); 
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                  arr[i] = sc.nextInt();
            }
            Arrays obj = new Arrays();
            obj.toString(arr);

      }

      
     
}
