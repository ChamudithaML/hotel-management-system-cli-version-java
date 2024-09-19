import java.util.Random;

public class Hotel {

    private final String name;
    private final int capacity;
    private final String location;

    public Hotel(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;

        Room[] rooms = new Room[6];
        initializeRooms(rooms);
    }

    public void initializeRooms(Room[] rooms) {
        Random rand = new Random();

        for(int i = 0; i < rooms.length; i++){
            rooms[i] = new Room(i+1, rand.nextInt(3)+1, rand.nextDouble(5000)+10000,"Deluxe");
        }
    }

    public void getHotelDetails() {
        System.out.println("Welcome to Cats & Dogs Hotel");
        System.out.println("\nHotel name: " + name+"\nHotel capacity: " + capacity+"\nHotel location: " + location);
    }
}
