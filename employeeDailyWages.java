import java.util.Scanner;
class employeeAttendance {
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            int attendance = sc.nextInt();
            switch (attendance) {
            case 1:
                  System.out.println("Employee is present");
                  break;
            case 2:
                  System.out.println("Employee is not present");
                  break;
            }
      }
}



public class employeeDailyWages {
      public static void main(String[] args)
      {
            int WagePerHour=20;
            int FullDayHour=8;
            int dailyEmployeeWage=WagePerHour*FullDayHour;
            System.out.println( dailyEmployeeWage);
       }
}

