package com.project.Entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "receipt")
@Data
public class Receipt{

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "receipt_id")
    private int receiptId;

    @Column(nullable = false)
    private LocalDate receiptDate; 

    @Column(nullable = false)
    private double receiptAmount;

    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
    private Payment payment;

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public double getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Payment getPaymentId() {
        return payment;
    }

    public void setPaymentId(Payment payment) {
        this.payment = payment;
    }
}