import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class Employee implements Utility {
    String Emp_ID ;
    String Emp_name ;
    String Emp_designation ;
    String Emp_add ;
    long Emp_mob ;
    double Emp_salary ;

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================******** ENTER EMPLOYEES DETAILS ************=======================");
        UUID uuid = UUID.randomUUID();
        Emp_ID = String.valueOf(uuid);
        System.out.print("ENTER EMPLOYEE NAME : ");
        Emp_name = sc.nextLine();
        System.out.print("ENTER EMPLOYEE DESIGNATION : ");
        Emp_designation = sc.nextLine();
        System.out.print("ENTER EMPLOYEE ADDRESS : ");
        Emp_add = sc.nextLine();
        System.out.print("ENTER MOBILE NO : ");
        Emp_mob = sc.nextLong();
        System.out.print("ENTER EMPLOYEE SALARY : ");
        Emp_salary = sc.nextDouble();
        System.out.println();
    }
    @Override
    public void get_details(){
        System.out.println("=====================******** HERE AVAILABLE EMPLOYEES DETAILS ************=======================");
        System.out.println("EMPLOYEE ID : " + Emp_ID);
        System.out.println("EMPLOYEE NAME : " + Emp_name);
        System.out.println("EMPLOYEE DESIGNATION : " + Emp_designation);
        System.out.println("EMPLOYEE ADDRESS : " + Emp_add);
        System.out.println("EMPLOYEE MOBILE NO :" + Emp_mob);
        System.out.println("EMPLOYEE SALARY : " + Emp_salary);

    }
}
