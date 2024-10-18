package com.bank.transfer.mapper;

import com.bank.transfer.dto.AccountTransferDTO;
import com.bank.transfer.entity.AccountTransfer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-18T13:24:53+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class AccountTransferMapperImpl implements AccountTransferMapper {

    @Override
    public AccountTransferDTO toDtoAccountTransfer(AccountTransfer accountTransfer) {
        if ( accountTransfer == null ) {
            return null;
        }

        Long id = null;
        Long accountNumber = null;
        Double amount = null;
        String purpose = null;
        Long accountDetailsId = null;

        id = accountTransfer.getId();
        accountNumber = accountTransfer.getAccountNumber();
        amount = accountTransfer.getAmount();
        purpose = accountTransfer.getPurpose();
        accountDetailsId = accountTransfer.getAccountDetailsId();

        AccountTransferDTO accountTransferDTO = new AccountTransferDTO( id, accountNumber, amount, purpose, accountDetailsId );

        return accountTransferDTO;
    }

    @Override
    public AccountTransfer toAccountTransfer(AccountTransferDTO accountTransferDTO) {
        if ( accountTransferDTO == null ) {
            return null;
        }

        AccountTransfer accountTransfer = new AccountTransfer();

        accountTransfer.setId( accountTransferDTO.getId() );
        accountTransfer.setAccountNumber( accountTransferDTO.getAccountNumber() );
        accountTransfer.setAmount( accountTransferDTO.getAmount() );
        accountTransfer.setPurpose( accountTransferDTO.getPurpose() );
        accountTransfer.setAccountDetailsId( accountTransferDTO.getAccountDetailsId() );

        return accountTransfer;
    }
}
