package com.bank.transfer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CardTransferDTO {

    private Long id;
    private Long cardNumber;
    private Double amount;
    private String purpose;
    private Long accountDetailsId;
}
