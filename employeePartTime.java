
class empPartTime {
            int PartTimeHour=8 ;
            int PartTimeWagePerHour=20 ;
            int PartTimeWage=PartTimeHour*PartTimeWagePerHour ;
            public void Check(){
                  System.out.println(PartTimeWage + " Rs " + " for total " + PartTimeHour + " hours");
            }
}

public class employeePartTime {
      public static void main(String[] args){
            empPartTime check = new empPartTime();
            check.Check();
      }
}
