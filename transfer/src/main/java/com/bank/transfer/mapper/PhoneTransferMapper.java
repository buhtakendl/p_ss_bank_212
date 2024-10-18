package com.bank.transfer.mapper;

import com.bank.transfer.dto.PhoneTransferDTO;
import com.bank.transfer.entity.PhoneTransfer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PhoneTransferMapper {

    @Mapping(source = "phoneTransfer.id", target = "id")
    PhoneTransferDTO toDtoPhoneTransfer(PhoneTransfer phoneTransfer);

    @Mapping(source = "phoneTransferDTO.id", target = "id")
    PhoneTransfer toPhoneTransfer(PhoneTransferDTO phoneTransferDTO);
}
