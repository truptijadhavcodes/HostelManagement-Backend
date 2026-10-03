package service;

import model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {

    private List<Room> rooms;

    public RoomService() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRoomByNumber(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }

        return null;
    }

    public boolean removeRoom(int roomNumber) {

        Room room = getRoomByNumber(roomNumber);

        if (room == null) {
            return false;
        }

        rooms.remove(room);
        return true;
    }

    public List<Room> getAllRooms() {
        return rooms;
    }

    public int getAvailableRooms() {

        int count = 0;

        for (Room room : rooms) {

            if (!room.isFull()) {
                count++;
            }
        }

        return count;
    }
}