package com.bank.transfer.mapper;

import com.bank.transfer.dto.CardTransferDTO;
import com.bank.transfer.entity.CardTransfer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-18T13:24:53+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class CardTransferMapperImpl implements CardTransferMapper {

    @Override
    public CardTransferDTO toDtoCardTransfer(CardTransfer cardTransfer) {
        if ( cardTransfer == null ) {
            return null;
        }

        Long id = null;
        Long cardNumber = null;
        Double amount = null;
        String purpose = null;
        Long accountDetailsId = null;

        id = cardTransfer.getId();
        cardNumber = cardTransfer.getCardNumber();
        amount = cardTransfer.getAmount();
        purpose = cardTransfer.getPurpose();
        accountDetailsId = cardTransfer.getAccountDetailsId();

        CardTransferDTO cardTransferDTO = new CardTransferDTO( id, cardNumber, amount, purpose, accountDetailsId );

        return cardTransferDTO;
    }

    @Override
    public CardTransfer toCardTransfer(CardTransferDTO cardTransferDTO) {
        if ( cardTransferDTO == null ) {
            return null;
        }

        CardTransfer cardTransfer = new CardTransfer();

        cardTransfer.setId( cardTransferDTO.getId() );
        cardTransfer.setCardNumber( cardTransferDTO.getCardNumber() );
        cardTransfer.setAmount( cardTransferDTO.getAmount() );
        cardTransfer.setPurpose( cardTransferDTO.getPurpose() );
        cardTransfer.setAccountDetailsId( cardTransferDTO.getAccountDetailsId() );

        return cardTransfer;
    }
}
