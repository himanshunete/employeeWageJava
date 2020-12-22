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



