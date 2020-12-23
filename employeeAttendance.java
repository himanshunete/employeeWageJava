import java.util.Random;
class empAttendance {
            Random num = new Random();
            int attendance; 
            public void Check(){
                  attendance = num.nextInt(2);
                  if (attendance == 0) {
                        System.out.println("Employee is present");
                  }
                  else {
                        System.out.println("Employee is not present");
                  }
            }
      
}


public class employeeAttendance {
      public static void main(String[] args)
      {
            empAttendance check = new empAttendance();
            check.Check();
      }
}
