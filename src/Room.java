public class Room {
    private int roomNumber;
    private int capacity;
    private double price;
    private String roomType;

    public Room(int roomNumber, int capacity, double price, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.price = price;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", capacity=" + capacity +
                ", price=" + price +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
