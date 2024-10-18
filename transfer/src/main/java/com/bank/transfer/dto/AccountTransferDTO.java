package com.bank.transfer.dto;

import lombok.Data;

@Data
public class AccountTransferDTO {
    private Long id;
    private Long accountNumber;
    private Double amount;
    private String purpose;
    private Long accountDetailsId;

}
