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
      public void toSum(int[] arr){
            int sum = 0;
            for(int i = 0;i<arr.length;i++){
                  sum += arr[i];
            }
            System.out.println("The sum of the array is: "+sum);
      }

      public double toAverageValue(int arr[]){
            int sum = 0;

            for(int i = 0;i<arr.length;i++){
                  sum+=arr[i];
            }
            return sum/arr.length;
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
            System.out.print("The array after sort is: "); obj.toString(arr); System.out.println();
            obj.toSum(arr);
            System.out.println("The average value of the array is "+obj.toAverageValue(arr));
      }

      
     
}
