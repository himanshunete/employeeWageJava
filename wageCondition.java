import java.util.Random;
class wageCondition{
   public static void main(String[] args){
      int WagePerHour=20;
      int TotalWagePerMonth=0;
      Random num = new Random();
      int fullTimeOrPartTime;
      int hours;
      for(hours=1;hours<=100;hours++){
         fullTimeOrPartTime=num.nextInt(2);
         if(fullTimeOrPartTime == 0){
            System.out.println(" Full time hour ");
            TotalWagePerMonth=TotalWagePerMonth + WagePerHour;
         }
         else{
            System.out.println(" Part time hour ");
            TotalWagePerMonth=TotalWagePerMonth + WagePerHour;
         }
      }
      System.out.println(TotalWagePerMonth + " is total wage per month");
   }
}
