package model;

import java.time.LocalDate;

public class Fee {

    private int receiptId;
    private int studentId;
    private double amount;
    private String paymentMode;
    private LocalDate paymentDate;

    public Fee(int receiptId, int studentId,
               double amount, String paymentMode) {

        this.receiptId = receiptId;
        this.studentId = studentId;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentDate = LocalDate.now();
    }

    public int getReceiptId() {
        return receiptId;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }
}