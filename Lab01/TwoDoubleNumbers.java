import java.util.Scanner;



public class TwoDoubleNumbers {
      public static void main(String[]args){
            String strNum1, strNum2;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            strNum1 = sc.nextLine();
            System.out.print("Enter the second number: ");
            strNum2 = sc.next();
            
            double num1 = Double.parseDouble(strNum1);
            double num2 = Double.parseDouble(strNum2);

            System.out.println("The sum of "+num1+" and "+num2+" is: "+sum(num1, num2));
            System.out.println("The difference of "+num1+" with "+num2+" is: "+difference(num1, num2));
            System.out.println("The product of "+num1+" and "+num2+" is: "+product(num1, num2));
            if(num2 == 0) System.out.println("The divisor is invalid!!!");
            else{
                  System.out.println("The quotient of "+num1+" with "+num2+" is: "+quotient(num1, num2));
            }
      }

      public static double sum(double num1, double num2){
            return num1+num2;
      }
      public static double difference(double num1, double num2){
            return num1 - num2;
      }
      public static double product(double num1, double num2){
            return num1*num2;
      }
      public static double quotient(double num1, double num2){
            return num1/num2;
      }
      
}
