package service;

import model.Room;
import model.RoomAllocation;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class RoomAllocationService {

    private List<RoomAllocation> allocations;

    public RoomAllocationService() {
        allocations = new ArrayList<>();
    }

    public boolean allocateRoom(int allocationId,
                                Student student,
                                Room room) {

        if (student.getRoomNumber() != 0) {
            return false;
        }

        if (room.isFull()) {
            return false;
        }

        room.addStudent();
        student.setRoomNumber(room.getRoomNumber());

        RoomAllocation allocation =
                new RoomAllocation(
                        allocationId,
                        student.getId(),
                        room.getRoomNumber()
                );

        allocations.add(allocation);

        return true;
    }

    public boolean deallocateRoom(Student student, Room room) {

        if (student.getRoomNumber() == 0) {
            return false;
        }

        if (student.getRoomNumber() != room.getRoomNumber()) {
            return false;
        }

        if (!room.removeStudent()) {
            return false;
        }

        student.setRoomNumber(0);

        return true;
    }

    public List<RoomAllocation> getAllAllocations() {
        return allocations;
    }
}