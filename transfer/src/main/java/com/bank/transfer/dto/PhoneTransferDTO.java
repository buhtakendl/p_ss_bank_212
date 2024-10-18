package com.bank.transfer.dto;

import lombok.Data;

@Data
public class PhoneTransferDTO {

    private Long id;
    private Long phoneNumber;
    private Double amount;
    private String purpose;
    private Long accountDetailsId;
}
