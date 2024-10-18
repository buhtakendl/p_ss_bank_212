package com.bank.transfer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PhoneTransferDTO {

    private Long id;
    private Long phoneNumber;
    private Double amount;
    private String purpose;
    private Long accountDetailsId;
}
