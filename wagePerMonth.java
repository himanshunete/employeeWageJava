

class MonthlyWage{
     int WorkingDayPerMonth=20;
     int WagePerDay=160;
     int WagePerMonth=WagePerDay*WorkingDayPerMonth;
     public void Check(){
           System.out.println(WorkingDayPerMonth + " Days per month ");
           System.out.println(WagePerMonth + " Rs ");
     }
}


class wagePerMonth{
   public static void main(String[] args){
         MonthlyWage check = new MonthlyWage();
         check.Check();
   }
}      
