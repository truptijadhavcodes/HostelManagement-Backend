package model;

public class Room {

    private int roomNumber;
    private String roomType;
    private int capacity;
    private int occupiedBeds;

    public Room(int roomNumber, String roomType, int capacity) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.occupiedBeds = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupiedBeds() {
        return occupiedBeds;
    }

    public int getAvailableBeds() {
        return capacity - occupiedBeds;
    }

    public boolean isFull() {
        return occupiedBeds >= capacity;
    }

    public boolean addStudent() {

        if (isFull()) {
            return false;
        }

        occupiedBeds++;

        return true;
    }

    public boolean removeStudent() {

        if (occupiedBeds <= 0) {
            return false;
        }

        occupiedBeds--;

        return true;
    }
}
