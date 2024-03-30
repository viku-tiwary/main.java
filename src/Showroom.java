import java.sql.SQLOutput;
import java.util.Scanner;

public class Showroom implements Utility {
    String Showroom_name ;
    String Showroom_Address ;
    String Showroom_Manager_Name ;
    int Total_employee ;
    int Total_Cars ;
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================******** ENTER YOUR SHOWROOM DETAILS ************=======================");
        System.out.println();
        System.out.print("ENTER SHOWROOM NAME :");
        Showroom_name = sc.nextLine();
        System.out.print("ENTER SHOWROOM ADDRESS :");
        Showroom_Address = sc.nextLine();
        System.out.print("ENTER SHOWROOM MANAGER NAME :");
        Showroom_Manager_Name = sc.nextLine();
        System.out.print("ENTER TOTAL NO OF EMPLOYEE :");
        Total_employee = sc.nextInt();
        System.out.print("ENTER TOTAL NO OF CARS :");
        Total_Cars = sc.nextInt();


    }
    @Override
    public void get_details(){
        System.out.println("=====================******** HERE AVAILABLE SHOWROOM DETAILS ************=======================");
        System.out.println();
        System.out.println("SHOWROOM NAME :" + Showroom_name);
        System.out.println("SHOWROOM ADDRESS :" + Showroom_Address);
        System.out.println("MANAGER OF SHOWROOM :" + Showroom_Manager_Name);
        System.out.println("TOTAL NO OF EMPLOYEE IN SHOWROOM :" + Total_employee);
        System.out.println("TOTAL NO OF CARS AVAILABLE IN SHOWROOM :"+ Total_Cars);
        System.out.println();

    }
}
