package model;

public class Admin extends User {

    private String employeeId;

    public Admin(int id, String name, String email, String employeeId) {

        super(id, name, email);

        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}