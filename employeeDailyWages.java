class empDailyWages {
      
            int WagePerHour=20;
            int FullDayHour=8;
            int dailyEmployeeWage=WagePerHour*FullDayHour;
            public void Check(){
                  System.out.println( dailyEmployeeWage);
            }
}

public class employeeDailyWages {
      public static void main(String[] args)
      {
            empDailyWages check = new empDailyWages();
            check.Check();
      }
}
