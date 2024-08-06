package com.rucreativedeveloper.rusty.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "payment")
@Builder
public class Payment {

    @Id
    @Column(name = "payment_id", nullable = false)
    private String paymentId;
    @Column(name = "payment_type", nullable = false, length = 100)
    private String paymentType;
    @Column(name = "date", columnDefinition = "DATETIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "transaction_id", length = 250, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String transactionId;
    @Column(name = "amount", nullable = false)
    private double amount;


}
