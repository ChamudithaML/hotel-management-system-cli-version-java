import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        Hotel hotel = new Hotel("Cats & Dogs",6,"SL");

        hotel.getHotelDetails();

        System.out.println("\nRooms Initialized");

        while (!quit) {
            System.out.println("\nEnter 'A' to add customer to a room\nEnter 'V' to view all rooms\nEnter 'Q' to quit");
            System.out.print("\nSelect an option: ");
            String option = input.next().toUpperCase();

            switch (option) {
                case "A":
                    System.out.println("\nCustomer added");
                    break;
                case "V":
                    System.out.println("\nShowing all rooms");
                    break;
                case "Q":
                    System.out.println("\nThank you for using Hotel Room Management System\nQuiting...");
                    quit = true;
                    break;
                default:
                    System.out.println("\nInvalid option");
                    break;
            }
        }
    }
}