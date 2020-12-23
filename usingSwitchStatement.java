import java.util.Scanner;
class usingSwitchStatement {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            int attendance = sc.nextInt();
            int checkFullTimeOrPartTime = sc.nextInt();
            int WagePerHour=20;
            int FullDayHour=8;
            int dailyEmployeeWage=WagePerHour*FullDayHour;
            int PartTimeHour=8 ;
            int PartTimeWagePerHour=20 ;
            int PartTimeWage=PartTimeHour*PartTimeWagePerHour ;

            switch (attendance) {
            case 1:
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
                  break;
            case 2:
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
                  break;
            }
      }
}





