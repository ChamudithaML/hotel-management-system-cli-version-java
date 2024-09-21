import java.util.Random;
import java.util.Scanner;

public class Hotel {

    private final String name;
    private final int capacity;
    private final String location;

    private Room[] rooms = new Room[6];

    public Hotel(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;

        initializeRooms(this.rooms);
    }

    Scanner input = new Scanner(System.in);

    public void initializeRooms(Room[] rooms) {
        Random rand = new Random();

        for(int i = 0; i < rooms.length; i++){
            rooms[i] = new Room(i+1, rand.nextInt(3)+1, rand.nextInt(5000)+10000,"Deluxe",null,0);
        }
    }

    public void getHotelDetails() {
        System.out.println("Welcome to Cats & Dogs Hotel");
        System.out.println("\nHotel name: " + name+"\nHotel capacity: " + capacity+"\nHotel location: " + location);
    }

    public boolean checkRoomAvailability(int roomNum) {
        return rooms[roomNum - 1].getGuest() == null;
    }

    public void addGuestToRoom() {
        boolean confirm = false;
        String fName="", lName="";
        int cNum=0, guestNum=0;

        while (!confirm){
            System.out.print("Enter Guest First Name: ");
            fName = input.nextLine();
            System.out.print("Enter Guest Last Name: ");
            lName = input.nextLine();
            System.out.print("Enter Guest Credit Card Number: ");
            cNum = input.nextInt();
            System.out.print("Enter number of Guests: ");
            guestNum = input.nextInt();

            input.nextLine();

            System.out.println("\nConfirm Guest Details\nFirst Name: "+fName+"\nLast Name: "+lName+"\nCredit Card Number: "+cNum+"\nNumber of Guests: "+guestNum);
            System.out.print("Enter 'Y' to continue or 'N' to edit the details: ");
            String choice = input.next().toUpperCase();
            input.nextLine();
            if(choice.equals("Y")){
                confirm = true;
            }
        }

        Guest newGuest = new Guest(fName,lName,cNum);

        while (true){
            System.out.print("Enter Room Number: ");
            int roomNum = input.nextInt();
            input.nextLine();

            if(checkRoomAvailability(roomNum)){
                rooms[roomNum-1].setGuest(newGuest);
                rooms[roomNum-1].setNoOfGuests(guestNum);
                System.out.println(fName+" Guest assigned to room number: " + roomNum);
                break;
            }else {
                System.out.println("Room number is Occupied");
            }
        }
    }
}
