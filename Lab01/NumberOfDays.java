import java.util.Scanner;

public class NumberOfDays {
      public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the year you want(a non-negative number): ");
            int year;
            do{
                  year = sc.nextInt();
                  if(year < 0) {

                        System.out.println("Invalid year input !!!");
                        System.out.print("Please enter again: ");
                  }

                  }while(year<0);
            System.out.printf("Enter your desired month of %d: ",year);
            String monthStr;
            int month;
            do{
            
             monthStr = sc.next();
            
            switch(monthStr){
                case "January":
                case "Jan.":
                case "Jan":
                case "1":
                    month = 1;
                    break;
                case "February":
                case "Feb":
                case "Feb.":
                case "2":
                    month = 2;
                    break;
                case "March":
                case "Mar":
                case "Mar.":
                case "3":
                    month = 3;
                    break;
                case "April":
                case "Apr":
                case "Apr.":
                case "4":
                    month = 4;
                    break;
                case "May":
                case "5":
                    month = 5;
                    break;
                case "June":
                case "Jun":
                case "6":
                    month = 6;
                    break;
                case "July":
                case "Jul":
                case "7":
                    month = 7;
                    break;
                case "August":
                case "Aug":
                case "Aug.":
                case "8":
                    month = 8;
                    break;
                case "September":
                case "Sep":
                case "Sept.":
                case "9":
                    month = 9;
                    break;
                case "October":
                case "Oct":
                case "Oct.":
                case "10":
                    month = 10;
                    break;
                case "November":
                case "Nov":
                case "Nov.":
                case "11":
                    month = 11;
                    break;
                case "December":
                case "Dec":
                case "Dec.":
                case "12":
                    month = 12;
                    break;
                default:
                  
                    month = 0;

                    System.out.printf("Invalid month !!!\nPlease enter again the correct month: ");
                    break;
            }
      }while(month==0);

      int numDays;
      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            // leap year
            switch (month) {
                case 2:
                    numDays = 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                default:
                    numDays = 31;
                    break;
            }
        } else {
            // common year
            switch (month) {
                case 2:
                    numDays = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                default:
                    numDays = 31;
                    break;
            }
        }
        System.out.printf("The month %d/%d has %d days !\n",month,year,numDays);
      }

}
