package model;

import java.time.LocalDate;

public class RoomAllocation {

    private int allocationId;
    private int studentId;
    private int roomNumber;
    private LocalDate allocationDate;

    public RoomAllocation(int allocationId, int studentId, int roomNumber) {

        this.allocationId = allocationId;
        this.studentId = studentId;
        this.roomNumber = roomNumber;
        this.allocationDate = LocalDate.now();
    }

    public int getAllocationId() {
        return allocationId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getAllocationDate() {
        return allocationDate;
    }
}
