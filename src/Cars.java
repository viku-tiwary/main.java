import java.util.Scanner;

public class Cars implements Utility{
    String Car_brand ;
    String Car_ftype ;
    String Car_color ;
    double Car_price;
    String Car_transition;
    String Car_type;
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================********** ENTER YOUR CAR DETAILS **********======================");
        System.out.print("ENTER CAR BRAND : ");
        Car_brand = sc.nextLine();
        System.out.print("ENTER CAR FLUE TYPE : ");
        Car_ftype = sc.nextLine();
        System.out.print("ENTER CAR COLORS : ");
        Car_color = sc.nextLine();
        System.out.print("ENTER CAR PRICE : ");
        Car_price= sc.nextDouble();
        System.out.print("ENTER CAR TRANSITION TYPE : ");
        Car_transition = sc.nextLine();
        System.out.print("ENTER CAR TYPE : ");
        Car_type = sc.nextLine();
        System.out.print("");
        //total_cars_in_stock++;


    }
    @Override
    public void get_details(){
        System.out.println("======================********** HERE IS YOUR CAR DETAILS **********======================");
        System.out.println(" Car Brand : " + Car_brand);
        System.out.println(" Car flue type : " + Car_ftype);
        System.out.println(" Car color : " + Car_color);
        System.out.println(" Car price $ : " + Car_price);
        System.out.println(" Car Transition : " + Car_transition);
        System.out.println(" Car Type : " + Car_type);
        System.out.println();
    }
}
