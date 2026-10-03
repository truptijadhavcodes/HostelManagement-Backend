package model;

import java.time.LocalDate;

public class Complaint {

    private int complaintId;
    private int studentId;
    private String title;
    private String description;
    private String status;
    private LocalDate complaintDate;

    public Complaint(int complaintId, int studentId,
                     String title, String description) {

        this.complaintId = complaintId;
        this.studentId = studentId;
        this.title = title;
        this.description = description;
        this.status = "Pending";
        this.complaintDate = LocalDate.now();
    }

    public int getComplaintId() {
        return complaintId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getComplaintDate() {
        return complaintDate;
    }

    public void resolveComplaint() {
        status = "Resolved";
    }
}