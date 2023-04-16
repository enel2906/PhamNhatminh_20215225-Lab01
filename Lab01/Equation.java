

import java.util.Scanner;

public class Equation {
      public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int choice;
            while(true){
                  System.out.println("Enter your choice:\n1.The first-degree equation (linear equation) with one variable.\n2.The system of first-degree equations (linear system) with two variables.\n3.The second-degree equation with one variable.");
                  choice = sc.nextInt();
                  switch(choice){
                        case 1: Equation.e1(); break;
                        case 2: Equation.e2(); break;
                        case 3: Equation.e3(); break;
                        default: break;
                  }
                  if(0>choice || choice > 3) break;
            }
      }
      public static void e1(){
            Double a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("The first-degree equation (linear equation) with one variable has type: ax + b = 0(a # 0)");
            System.out.print("a = ");
            a = sc.nextDouble();
            System.out.print("b = ");
            b = sc.nextDouble();

            System.out.printf("The equation you want to calculate is: %.2fx + %.2f = 0\n",a,b);

            if(a==0){
                  if(b == 0) System.out.println("The equation has infinitely many solutions !");
                  else System.out.println("The equation has no solution !");
            }
            else{
                  System.out.printf("The equation has one solution: x = %.2f\n",(-b/a));
            }
      }
      public static void e2(){
            Scanner sc = new Scanner(System.in);
            Double[][] a = new Double[2][2];
            Double [] b = new Double[2];
            System.out.println("The system of first-degree equations (linear system) with two variables has type:");
            System.out.println("a11x + a12y = b1\na21x + a22y = b2");
            for(int i = 0;i<2;i++){
                  for(int j = 0; j< 2;j++){
                        System.out.printf("a%d%d = ",i+1,j+1);
                        a[i][j] = sc.nextDouble();
                  }
            }
            for(int i = 0;i<2;i++){
                  System.out.printf("b%d = ",i+1 );
                  b[i] = sc.nextDouble();
            }

            System.out.printf("The system of first-degree equations (linear system) with two variables is:\n%.2fx + %.2fy = %.2f\n%.2fx + %.2fy =  %.2f\n",a[0][0],a[0][1],b[0],a[1][0],a[1][1],b[1]);

            if((a[0][0]/a[1][0]) == (a[0][1]/a[1][1])){
                  if((a[0][0]/a[1][0])==(b[0]/b[1])){
                        System.out.println("The system has infinitely many solutions !");
                  }
                  else System.out.println("The system has no solution !");
            }

            else{
                  Double det = (a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
                  Double detx = (b[0]*a[1][1])-(a[0][1]*b[1]);
                  Double dety = (a[0][0]*b[1])-(b[0]*a[1][0]);
                  System.out.println("The system has one solution:");
                  System.out.printf("x = %.2f\n",detx/det);
                  System.out.printf("y = %.2f\n",dety/det);

            }
            
      }

      public static void e3(){
            Scanner sc = new Scanner(System.in);
            System.out.println("The second-degree equation with one variable has type: ax2 + bx + c = 0(a#0)");
            System.out.print("a = ");
            Double a = sc.nextDouble();
            System.out.print("b = ");
            Double b = sc.nextDouble();
            System.out.print("c = ");
            Double c = sc.nextDouble();
            System.out.printf("The second-degree equation is: %.2fx2 + %.2fx + %.2f = 0\n",a,b,c);

            if(a==0){
                  if(b == 0){
                        if(c==0) System.out.println("The equation has infinitely many solutions !");
                        else System.out.println("The equation has no solution!");
                  }
                  else{
                        System.out.printf("The equation has one solution x = %.2f",(-c/b));
                  }
            }
            else {
                  double denta = b*b - 4*a*c;
                  if(denta > 0){
                        System.out.println("The equation has two solutions:");
                        System.out.printf("x1 = %.2f\n",(-b+Math.sqrt(denta))/(2*a));
                        System.out.printf("x2 = %.2f\n",(-b-Math.sqrt(denta))/(2*a));
                  }
                  else if(denta == 0){
                        System.out.printf("The equation has double solution: x = %.2f\n",-b/(2*a));
                  }
                  else{
                        System.out.println("The equation has no solution!");
                  }
            }


      }


}
