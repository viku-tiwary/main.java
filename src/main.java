import java.util.Scanner;

interface Utility {
    public void get_details();
    public void set_details();
public class main {
    static void main_menu() {
        System.out.println();
        System.out.println("================***** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *****================");
        System.out.println();
        System.out.println("====================**********  ENTER VALID OPTIONS **********===================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println("=======================**********  ENTER 0 TO EXIT **********======================");
        System.out.print("ENTER YOUR OPTION HERE :");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[10];
        Employee employee[] = new Employee[10];
        Cars cars[] = new Cars[10];
        int Showroom_counter = 0;
        int Employee_counter = 0;
        int Cars_counter = 0;
        int choice = 100;

        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();

            while (choice != 7 && choice != 0)
                {

                switch (choice) {
                    case 1:
                        showroom[Showroom_counter] = new Showroom();
                        showroom[Showroom_counter].set_details();
                        Showroom_counter++;
                        System.out.println();
                        System.out.println("1]. ADD NEW SHOWROOM");
                        System.out.println("7]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[Employee_counter] = new Employee();
                        employee[Employee_counter].set_details();
                        Employee_counter++;
                        System.out.println();
                        System.out.println("2]. ADD NEW EMPLOYEE");
                        System.out.println("7]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        cars[Cars_counter] = new Cars();
                        cars[Cars_counter].set_details();
                        Cars_counter++;
                        System.out.println();
                        System.out.println("3]. ADD NEW CARS");
                        System.out.println("7]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i =0; i<Showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("7].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i =0; i< Employee_counter;i++){
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("7].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0;Cars_counter < i;i++){
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("7].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid options :");
                        break;

                }

            }
        }


    }
}
}
