import java.util.Scanner;

class Matrixs{
      int m[][] = new int[100][100];
      Scanner sc = new Scanner(System.in);
      int r , c;

      public void getMatrixs(){
            System.out.print("Number of rows: "); 
            this.r = sc.nextInt();
            System.out.print("Number of columns: ");
            this.c = sc.nextInt();
            
            for(int i = 0;i<r;i++){
                  System.out.println("Enter the elements of row "+(i+1));
                  for(int j = 0;j<c;j++){
                        m[i][j] = sc.nextInt();
                  }
            }

      }
      
}

public class matrix {
      public static void main(String[]args){

      
    Scanner sc = new Scanner(System.in);
    
    Matrixs m1 = new Matrixs();
    
      System.out.println("Enter the first matrix!");
      m1.getMatrixs();
      Matrixs m2 = new Matrixs();

      System.out.println("Enter the second matrix!");
      m2.getMatrixs();

      if(m1.r != m2.r || m1.c != m2.c){
            System.out.println("The two matrix does not have the same size!!!");
      }
      else{
            Matrixs m3 = new Matrixs();
            m3.r = m2.r;
            m3.c = m1.c;
            for(int i = 0;i<m3.r;i++){
                  for(int j = 0;j<m3.c;j++){
                        m3.m[i][j] = m1.m[i][j] + m2.m[i][j];
                  }
            }
            System.out.println("After add two matrices of the same size we obtain the matrix:");
            for(int i = 0;i<m3.r;i++){
                  for(int j = 0;j<m3.c;j++){
                        System.out.printf("%-4d",m3.m[i][j]) ;
                  }
                  System.out.println();
            }
      }
    
      }
}
