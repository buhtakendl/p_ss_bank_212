package com.bank.transfer.mapper;

import com.bank.transfer.dto.PhoneTransferDTO;
import com.bank.transfer.entity.PhoneTransfer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-18T13:29:43+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class PhoneTransferMapperImpl implements PhoneTransferMapper {

    @Override
    public PhoneTransferDTO toDtoPhoneTransfer(PhoneTransfer phoneTransfer) {
        if ( phoneTransfer == null ) {
            return null;
        }

        Long id = null;
        Long phoneNumber = null;
        Double amount = null;
        String purpose = null;
        Long accountDetailsId = null;

        id = phoneTransfer.getId();
        phoneNumber = phoneTransfer.getPhoneNumber();
        amount = phoneTransfer.getAmount();
        purpose = phoneTransfer.getPurpose();
        accountDetailsId = phoneTransfer.getAccountDetailsId();

        PhoneTransferDTO phoneTransferDTO = new PhoneTransferDTO( id, phoneNumber, amount, purpose, accountDetailsId );

        return phoneTransferDTO;
    }

    @Override
    public PhoneTransfer toPhoneTransfer(PhoneTransferDTO phoneTransferDTO) {
        if ( phoneTransferDTO == null ) {
            return null;
        }

        PhoneTransfer phoneTransfer = new PhoneTransfer();

        phoneTransfer.setId( phoneTransferDTO.getId() );
        phoneTransfer.setPhoneNumber( phoneTransferDTO.getPhoneNumber() );
        phoneTransfer.setAmount( phoneTransferDTO.getAmount() );
        phoneTransfer.setPurpose( phoneTransferDTO.getPurpose() );
        phoneTransfer.setAccountDetailsId( phoneTransferDTO.getAccountDetailsId() );

        return phoneTransfer;
    }
}
