package com.bank.transfer.mapper;

import com.bank.transfer.dto.CardTransferDTO;
import com.bank.transfer.entity.CardTransfer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardTransferMapper {
    @Mapping(source = "cardTransfer.id", target = "id")
    CardTransferDTO toDtoCardTransfer(CardTransfer cardTransfer);

    @Mapping(source = "cardTransferDTO.id", target = "id")
    CardTransfer toCardTransfer(CardTransferDTO cardTransferDTO);
}
