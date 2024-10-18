package com.bank.transfer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "account_transfer", schema = "transfer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column (name = "account_number", unique = true)
    private Long accountNumber;

    @Column (name = "amount", precision = 20, scale = 2)
    private Double amount;

    @Column (name = "purpose", nullable = false)
    private String purpose;

    @Column (name = "account_details_id")
    private Long accountDetailsId;
}
