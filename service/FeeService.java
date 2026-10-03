package service;

import model.Fee;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class FeeService {

    private List<Fee> fees;

    public FeeService() {
        fees = new ArrayList<>();
    }

    public boolean payFee(int receiptId,
                          Student student,
                          double amount,
                          String paymentMode) {

        if (!student.payFee(amount)) {
            return false;
        }

        Fee fee = new Fee(
                receiptId,
                student.getId(),
                amount,
                paymentMode
        );

        fees.add(fee);

        return true;
    }

    public List<Fee> getAllFees() {
        return fees;
    }

    public double getTotalCollected() {

        double total = 0;

        for (Fee fee : fees) {
            total += fee.getAmount();
        }

        return total;
    }
}