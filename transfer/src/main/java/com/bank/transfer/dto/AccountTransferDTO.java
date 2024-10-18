package com.bank.transfer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AccountTransferDTO {
    private Long id;
    private Long accountNumber;
    private Double amount;
    private String purpose;
    private Long accountDetailsId;
}
