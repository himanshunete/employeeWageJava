import java.util.Scanner;
import java.util.Random;
class WageComputation {
            public static Scanner sc = new Scanner(System.in);
            public static Random num= new Random();
            public static int attendance;
            public static int checkFullTimeOrPartTime;
            public static int WagePerHour;
            public static int FullDayHour;
            public static int dailyEmployeeWage;
            public static int PartTimeHour ;
            public static int PartTimeWagePerHour ;
            public static int PartTimeWage ;
            public static int TotalWagePerMonth=0;
            public static int daysPerMonth;
            public static int days;
            public static int WagePerDay;
            public static void CheckingWage(int WagePerHour,int FullDayHour, int PartTimeHour,int PartTimeWagePerHour, int daysPerMonth,int WagePerDay ){
                  checkFullTimeOrPartTime = sc.nextInt();
                  attendance=num.nextInt(2);
                  dailyEmployeeWage=WagePerHour*FullDayHour;
                  PartTimeWage=PartTimeHour*PartTimeWagePerHour ;
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
                  
                  for(days=1;days<=daysPerMonth;days++){
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



public class wageForMultipleCompanies {
     public static void main(String[] args){
           WageComputation Audi = new  WageComputation();
           WageComputation BMW = new  WageComputation();
           WageComputation Ferrari = new  WageComputation();
           WageComputation HarleyDavidson = new  WageComputation();
           WageComputation Indian = new  WageComputation();
           System.out.println(" Employee of Audi Company ");
           Audi.CheckingWage(30,8,8,30,25,240);
           System.out.println(" Employee of BMW Company ");
           BMW.CheckingWage(50,5,5,50,20,250);
           System.out.println(" Employee of Ferrari Company ");
           Ferrari.CheckingWage(20,4,4,20,25,80);
           System.out.println(" Employee of HarleyDavidson Company ");
           HarleyDavidson.CheckingWage(45,8,8,45,28,360);
           System.out.println(" Employee of Indian Company ");
           Indian.CheckingWage(80,5,5,80,27,400);



     }
}
