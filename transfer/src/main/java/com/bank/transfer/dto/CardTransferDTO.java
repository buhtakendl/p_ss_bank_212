package com.bank.transfer.dto;

import lombok.Data;

@Data
public class CardTransferDTO {

    private Long id;
    private Long cardNumber;
    private Double amount;
    private String purpose;
    private Long accountDetailsId;
}
