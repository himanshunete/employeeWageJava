
import java.util.Random;
class employeeAttendance {
      public static void main(String[] args)
      {
            Random num = new Random();
            int attendance = num.nextInt(2);
            if (attendance == 0) {
                  System.out.println("Employee is present");
            }
            else {
                  System.out.println("Employee is not present");
            }
      }
}


