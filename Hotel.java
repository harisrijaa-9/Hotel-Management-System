import java.util.Scanner;
import java.io.*;

class Hotel {

    private int room_no;
    private String name;
    private String address;
    private String phone;

    public void mainMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n\t\t\t\t*************************");
            System.out.println("\n\t\t\t\t SIMPLE HOTEL MANAGEMENT ");
            System.out.println("\n\t\t\t\t      * MAIN MENU *");
            System.out.println("\n\t\t\t\t*************************");
            System.out.println("\n\n\n\t\t\t1.Book A Room");
            System.out.println("\t\t\t2.Customer Records");
            System.out.println("\t\t\t3.Rooms Allotted");
            System.out.println("\t\t\t4.Edit Record");
            System.out.println("\t\t\t5.Exit");
            System.out.print("\n\n\t\t\tEnter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    rooms();
                    break;
                case 4:
                    edit();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n\n\t\t\tWrong choice.....!!!");
            }

        } while (choice != 5);

        scanner.close();
    }

    public void add() {
        // Implementation for adding a room
    }

    public void display() {
        // Implementation for displaying a customer's details
    }

    public void rooms() {
        // Implementation for displaying all allotted rooms
    }

    public void edit() {
        // Implementation for editing a record
    }

    // Other methods...
}

public class Main {
    public static void main(String[] args) {
        Hotel h = new Hotel();

        System.out.println("\n\t\t\t****************************");
        System.out.println("\n\t\t\t* HOTEL MANAGEMENT PROJECT *");
        System.out.println("\n\t\t\t****************************");
        System.out.println("\n\n\t\tDeveloped By:");
        System.out.println("\t Hari Srijaa");
        System.out.print("\n\n\n\n\n\n\n\t\t\t\t\tPress Enter to continue....!!");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        h.mainMenu();
    }
}
