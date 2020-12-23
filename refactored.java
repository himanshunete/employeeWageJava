import java.util.Scanner;
import java.util.Random;
class WageComputation {
            public static Scanner sc = new Scanner(System.in);
            public static Random num= new Random();
            public static int attendance;
            public static int checkFullTimeOrPartTime = sc.nextInt();
            public static int WagePerHour=20;
            public static int FullDayHour=8;
            public static int dailyEmployeeWage=WagePerHour*FullDayHour;
            public static int PartTimeHour=8 ;
            public static int PartTimeWagePerHour=20 ;
            public static int PartTimeWage=PartTimeHour*PartTimeWagePerHour ;
            public static int TotalWagePerMonth=0;
            public static int days;
            public static int WagePerDay=160;
            public static void CheckingWage(){
                  attendance=num.nextInt(2);
                  if (attendance == 0) {
                        System.out.println("Employee is present");
                        switch (checkFullTimeOrPartTime){
                        case 1:
                              System.out.println(" Employee is working for  FullTime " );
                              System.out.println(dailyEmployeeWage + " Rs  for total " +  FullDayHour + " FullTimeHours " );
                              break;
                        case 2:
                              System.out.println(" Employee is working for  PartTime " );
                              System.out.println(PartTimeWage + " Rs " + " for total " + PartTimeHour + " PartTimeHours" );
                              break;
                        }
                  
                  for(days=1;days<=20;days++){
                        TotalWagePerMonth=TotalWagePerMonth + WagePerDay;
                  }
                  System.out.println( TotalWagePerMonth + " is total wage per month");
                  }
                  else {
                        System.out.println("Employee is not present");
                        switch (checkFullTimeOrPartTime){
                        case 1:
                              System.out.println(" Employee is working for  FullTime " );
                              System.out.println(dailyEmployeeWage + " Rs  for total " +  FullDayHour + " FullTimeHours " );
                              break;
                        case 2:
                              System.out.println(" Employee is working for  PartTime " );
                              System.out.println(PartTimeWage + " Rs " + " for total " + PartTimeHour + "  PartTimeHours " );
                              break;
                        }
                  
                  for(days=1;days<=20;days++){
                        TotalWagePerMonth=TotalWagePerMonth + WagePerDay;
                  }

                   System.out.println(TotalWagePerMonth + " is total wage per month");


                  } 
            }



}



public class refactored {
     public static void main(String[] args){
           WageComputation.CheckingWage();
     }
}
