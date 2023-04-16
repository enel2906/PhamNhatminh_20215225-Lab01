import javax.swing.JOptionPane;

public class ShowTwoNumbers {
      public static void main(String[]args){
            String strNum1, strNum2, strNotification = "You're just entered: ";

            strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);

            strNotification += strNum1 + " and ";

            strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);

            
            strNotification += strNum2;

            JOptionPane.showMessageDialog(null, strNotification, "Show two number",JOptionPane.INFORMATION_MESSAGE);

            double num1 = Double.parseDouble(strNum1);
            double num2 = Double.parseDouble(strNum2);

            JOptionPane.showMessageDialog(null, num1 + " + "+num2 +" = "+sum(num1, num2),"SUM OF TWO NUMBERS",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, num1+" - "+num2+" = "+difference(num1, num2), "THE DIFFERENCE OF TWO NUMBER", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, num1+" * "+num2+" = "+product(num1, num2),"THE PRODUCT OF TWO NUMBER", JOptionPane.INFORMATION_MESSAGE);
            if(num2 == 0) JOptionPane.showMessageDialog(null, "CAN CALCULATE THE QUOTIENT BECAUSE THE DIVISOR IS ZERO!!!",null, JOptionPane.INFORMATION_MESSAGE);
         else JOptionPane.showMessageDialog(null, num1+" / "+num2+" = " + quotient(num1, num2),"THE QUOTIENT OF TWO NUMBER",JOptionPane.INFORMATION_MESSAGE);

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
