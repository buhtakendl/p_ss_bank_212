package com.bank.transfer.mapper;

import com.bank.transfer.dto.AccountTransferDTO;
import com.bank.transfer.entity.AccountTransfer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountTransferMapper {

    @Mapping(source = "accountTransfer.id", target = "id")
    AccountTransferDTO toDtoAccountTransfer(AccountTransfer accountTransfer);

    @Mapping(source = "accountTransferDTO.id", target = "id")
    AccountTransfer toAccountTransfer(AccountTransferDTO accountTransferDTO);
}
