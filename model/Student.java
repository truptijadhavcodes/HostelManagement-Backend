package model;

public class Student extends User {

    private String course;
    private int year;
    private String phone;
    private int roomNumber;

    private double totalFee;
    private double paidFee;

    public Student(int id, String name, String email,
                   String course, int year, String phone,
                   double totalFee) {

        super(id, name, email);

        this.course = course;
        this.year = year;
        this.phone = phone;
        this.roomNumber = 0;

        this.totalFee = totalFee;
        this.paidFee = 0;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public double getPaidFee() {
        return paidFee;
    }

    public double getPendingFee() {
        return totalFee - paidFee;
    }

    public boolean payFee(double amount) {

        if (amount <= 0) {
            return false;
        }

        if (paidFee + amount > totalFee) {
            return false;
        }

        paidFee = paidFee + amount;

        return true;
    }
}