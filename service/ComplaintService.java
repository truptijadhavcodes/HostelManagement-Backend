package service;

import model.Complaint;

import java.util.ArrayList;
import java.util.List;

public class ComplaintService {

    private List<Complaint> complaints;

    public ComplaintService() {
        complaints = new ArrayList<>();
    }

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }

    public Complaint getComplaintById(int complaintId) {

        for (Complaint complaint : complaints) {

            if (complaint.getComplaintId() == complaintId) {
                return complaint;
            }
        }

        return null;
    }

    public boolean resolveComplaint(int complaintId) {

        Complaint complaint = getComplaintById(complaintId);

        if (complaint == null) {
            return false;
        }

        complaint.resolveComplaint();

        return true;
    }

    public List<Complaint> getAllComplaints() {
        return complaints;
    }

    public int getPendingComplaints() {

        int count = 0;

        for (Complaint complaint : complaints) {

            if (complaint.getStatus().equals("Pending")) {
                count++;
            }
        }

        return count;
    }
}